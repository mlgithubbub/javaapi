/*
 * Copyright (c) 2000, 2022, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

// -- This file was mechanically generated: Do not edit! -- //

package java.nio;

import java.io.FileDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.ref.Reference;
import java.util.Objects;
import jdk.internal.foreign.MemorySessionImpl;
import jdk.internal.misc.ScopedMemoryAccess.ScopedAccessError;
import jdk.internal.misc.VM;
import jdk.internal.ref.Cleaner;
import sun.nio.ch.DirectBuffer;



sealed



class DirectShortBufferU

    extends ShortBuffer



    implements DirectBuffer

    permits DirectShortBufferRU

{



    // Cached unaligned-access capability
    protected static final boolean UNALIGNED = Bits.unaligned();

    // Base address, used in all indexing calculations
    // NOTE: moved up to Buffer.java for speed in JNI GetDirectBufferAddress
    //    protected long address;

    // An object attached to this buffer. If this buffer is a view of another
    // buffer then we use this field to keep a reference to that buffer to
    // ensure that its memory isn't freed before we are done with it.
    private final Object att;

    public Object attachment() {
        return att;
    }




































    public Cleaner cleaner() { return null; }



































































































    // For duplicates and slices
    //
    DirectShortBufferU(DirectBuffer db,         // package-private
                               int mark, int pos, int lim, int cap, int off,



                               MemorySegment segment)
    {

        super(mark, pos, lim, cap,



              segment);
        address = ((Buffer)db).address + off;



        Object attachment = db.attachment();
        att = (attachment == null ? db : attachment);








    }

    @Override
    Object base() {
        return null;
    }

    public ShortBuffer slice() {
        int pos = this.position();
        int lim = this.limit();
        int rem = (pos <= lim ? lim - pos : 0);
        int off = (pos << 1);
        assert (off >= 0);
        return new DirectShortBufferU(this,
                                              -1,
                                              0,
                                              rem, 
                                              rem,
                                              off,




                                              segment);
    }

    @Override
    public ShortBuffer slice(int index, int length) {
        Objects.checkFromIndexSize(index, length, limit());
        return new DirectShortBufferU(this,
                                              -1,
                                              0,
                                              length,
                                              length,
                                              index << 1,




                                              segment);
    }

    public ShortBuffer duplicate() {
        return new DirectShortBufferU(this,
                                              this.markValue(),
                                              this.position(),
                                              this.limit(),
                                              this.capacity(),
                                              0,




                                              segment);
    }

    public ShortBuffer asReadOnlyBuffer() {

        return new DirectShortBufferRU(this,
                                           this.markValue(),
                                           this.position(),
                                           this.limit(),
                                           this.capacity(),
                                           0,




                                           segment);



    }



    public long address() {
        MemorySessionImpl session = session();
        if (session != null) {
            if (session.ownerThread() == null && session.isCloseable()) {
                throw new UnsupportedOperationException("ByteBuffer derived from closeable shared sessions not supported");
            }
            session.checkValidState();
        }
        return address;
    }

    private long ix(int i) {
        return address + ((long)i << 1);
    }

    public short get() {
        try {
            return ((SCOPED_MEMORY_ACCESS.getShort(session(), null, ix(nextGetIndex()))));
        } finally {
            Reference.reachabilityFence(this);
        }
    }

    public short get(int i) {
        try {
            return ((SCOPED_MEMORY_ACCESS.getShort(session(), null, ix(checkIndex(i)))));
        } finally {
            Reference.reachabilityFence(this);
        }
    }












    public ShortBuffer put(short x) {

        try {
            SCOPED_MEMORY_ACCESS.putShort(session(), null, ix(nextPutIndex()), ((x)));
        } finally {
            Reference.reachabilityFence(this);
        }
        return this;



    }

    public ShortBuffer put(int i, short x) {

        try {
            SCOPED_MEMORY_ACCESS.putShort(session(), null, ix(checkIndex(i)), ((x)));
        } finally {
            Reference.reachabilityFence(this);
        }
        return this;



    }

    public ShortBuffer compact() {

        int pos = position();
        int lim = limit();
        assert (pos <= lim);
        int rem = (pos <= lim ? lim - pos : 0);
        try {
            // null is passed as destination MemorySession to avoid checking session() twice
            SCOPED_MEMORY_ACCESS.copyMemory(session(), null, null,
                    ix(pos), null, ix(0), (long)rem << 1);
        } finally {
            Reference.reachabilityFence(this);
        }
        position(rem);
        limit(capacity());
        discardMark();
        return this;



    }

    public boolean isDirect() {
        return true;
    }

    public boolean isReadOnly() {
        return false;
    }













































    public ByteOrder order() {





        return ((ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN)
                ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);

    }


















}
