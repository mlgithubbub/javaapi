/*
 * Copyright (c) 2012, 2023, Oracle and/or its affiliates. All rights reserved.
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

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (c) 1991-2022 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in https://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that either
 * (a) this copyright and permission notice appear with all copies
 * of the Data Files or Software, or
 * (b) this copyright and permission notice appear in associated
 * Documentation.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_pcm extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "FM",
            "FI",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
        };
        final String[] metaValue_MonthNames = new String[] {
            "J\u00e9n\u00fa\u00e1ri",
            "F\u1eb9\u0301b\u00fa\u00e1ri",
            "Mach",
            "\u00c9prel",
            "Mee",
            "Jun",
            "Julai",
            "\u1eccg\u1ecdst",
            "S\u1eb9pt\u1eb9\u0301mba",
            "\u1ecckt\u00f3ba",
            "N\u1ecdv\u1eb9\u0301mba",
            "Dis\u1eb9\u0301mba",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "J",
            "F",
            "M",
            "A",
            "M",
            "J",
            "J",
            "A",
            "S",
            "O",
            "N",
            "D",
            "",
        };
        final String[] metaValue_generic_DayNames = new String[] {
            "S\u1ecd\u0301nd\u00e8",
            "M\u1ecd\u0301nd\u00e8",
            "Ti\u00fazd\u00e8",
            "W\u1eb9\u0301n\u1eb9\u0301zd\u00e8",
            "T\u1ecd\u0301zd\u00e8",
            "Fra\u00edd\u00e8",
            "S\u00e1t\u1ecdd\u00e8",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "S\u1ecd\u0301n",
            "M\u1ecd\u0301n",
            "Ti\u00fa",
            "W\u1eb9\u0301n",
            "T\u1ecd\u0301z",
            "Fra\u00ed",
            "S\u00e1t",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "F\u1eb9\u0301st Kw\u1ecd\u0301ta",
            "S\u1eb9\u0301k\u1ecd\u0301n Kw\u1ecd\u0301ta",
            "T\u1ecd\u0301d Kw\u1ecd\u0301ta",
            "F\u1ecd\u0301t Kw\u1ecd\u0301ta",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "K1",
            "K2",
            "K3",
            "K4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "F\u1ecd m\u1ecd\u0301nin",
            "F\u1ecd \u00edvnin",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
        };
        final String[] metaValue_Eras = new String[] {
            "BK",
            "KIY",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "H:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String metaValue_generic_DateFormatItem_hm = "h:mm\u202fa";
        final String metaValue_generic_DateFormatItem_Ehm = "E h:mm\u202fa";
        final String metaValue_generic_DateFormatItem_hms = "h:mm:ss\u202fa";
        final String metaValue_generic_DateFormatItem_hmv = "h:mm\u202fa v";
        final String metaValue_generic_DateFormatItem_hmsv = "h:mm:ss\u202fa v";
        final String metaValue_generic_DateFormatItem_yw = "'Wiik' w 'f\u1ecd' Y";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y";
        final String metaValue_generic_DateFormatItem_MMMMd = "d MMMM";
        final String metaValue_generic_DateFormatItem_MMMEd = "E, d MMM";
        final String metaValue_generic_DateFormatItem_h = "h\u202fa";
        final String metaValue_generic_DateFormatItem_MMMd = "d MMM";
        final String metaValue_generic_DateFormatItem_MMMMW = "'Wik' W 'f\u1ecd' MMMM";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E, d MMM y";
        final String metaValue_generic_DateFormatItem_Ehms = "E h:mm:ss\u202fa";
        final String metaValue_generic_DateFormatItem_yMEd = "E, d/M/y";
        final String metaValue_generic_DateFormatItem_yMMMd = "d MMM y";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y";
        final String metaValue_generic_DateFormatItem_Md = "d /M";
        final String metaValue_generic_DateFormatItem_Ed = "d E";
        final String metaValue_generic_DateFormatItem_MEd = "E, d/M";
        final String metaValue_generic_DateFormatItem_yMd = "d/M/y";
        final String metaValue_generic_DateFormatItem_yM = "M/y";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y";
        final String metaValue_generic_DateFormatItem_yQQQQ = "QQQQ y";
        final String[] metaValue_MonthAbbreviations = new String[] {
            "J\u00e9n",
            "F\u1eb9\u0301b",
            "Mach",
            "\u00c9pr",
            "Mee",
            "Jun",
            "Jul",
            "\u1eccg\u1ecd",
            "S\u1eb9p",
            "\u1ecckt",
            "N\u1ecdv",
            "Dis",
            "",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "S",
            "M",
            "T",
            "W",
            "T",
            "F",
            "S",
        };
        final String[] metaValue_generic_QuarterNarrows = new String[] {
            "1",
            "2",
            "3",
            "4",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, d MMMM y G",
            "d MMMM y G",
            "d MMM y G",
            "dd/MM/y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, d MMMM y GGGG",
            "d MMMM y GGGG",
            "d MMM y GGGG",
            "dd/MM/y G",
        };
        final String metaValue_generic_DateFormatItem_Hmsv = "HH:mm:ss v";
        final String metaValue_generic_DateFormatItem_y = "y";
        final String metaValue_generic_DateFormatItem_Hmv = "HH:mm v";
        final String metaValue_buddhist_DateFormatItem_Gy = "G y";
        final String metaValue_buddhist_DateFormatItem_Hm = "HH:mm";
        final String metaValue_buddhist_DateFormatItem_EHm = "E HH:mm";
        final String metaValue_buddhist_DateFormatItem_EBhm = "E h:mm B";
        final String metaValue_buddhist_DateFormatItem_E = "ccc";
        final String metaValue_buddhist_DateFormatItem_H = "HH";
        final String metaValue_buddhist_DateFormatItem_M = "L";
        final String metaValue_buddhist_DateFormatItem_d = "d";
        final String metaValue_buddhist_DateFormatItem_Bh = "h B";
        final String metaValue_buddhist_DateFormatItem_GyMMM = "G y MMM";
        final String metaValue_buddhist_DateFormatItem_Bhms = "h:mm:ss B";
        final String metaValue_buddhist_DateFormatItem_GyMMMd = "G y MMM d";
        final String metaValue_buddhist_DateFormatItem_ms = "mm:ss";
        final String metaValue_buddhist_DateFormatItem_EHms = "E HH:mm:ss";
        final String metaValue_buddhist_DateFormatItem_MMM = "LLL";
        final String metaValue_buddhist_DateFormatItem_EBhms = "E h:mm:ss B";
        final String metaValue_buddhist_DateFormatItem_Bhm = "h:mm B";
        final String metaValue_buddhist_DateFormatItem_GyMMMEd = "G y MMM d, E";
        final String metaValue_buddhist_DateFormatItem_Hms = "HH:mm:ss";
        final String metaValue_calendarname_gregorian = "Gr\u1eb9\u0301g\u00f3r\u00ed Kal\u1eb9\u0301nda";
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
            { "generic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "generic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "generic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "generic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.yyyy", "y G" },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "J\u00e9n",
                    "F\u1eb9\u0301b",
                    "Mach",
                    "\u00c9pr",
                    "Mee",
                    "Jun",
                    "Jul",
                    "\u1ecc\u0301g\u1ecd",
                    "S\u1eb9p",
                    "\u1ecckt",
                    "N\u1ecdv",
                    "Dis",
                    "",
                }
            },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "long.Eras",
                new String[] {
                    "Bif\u1ecd\u0301 Kraist",
                    "Kraist Im Yi\u1eb9",
                }
            },
            { "Eras", metaValue_Eras },
            { "narrow.Eras", metaValue_Eras },
            { "field.era", "Taim" },
            { "field.year", "Yi\u1eb9" },
            { "field.month", "M\u1ecdnt" },
            { "field.week", "Wik" },
            { "field.weekday", "D\u00e8 f\u1ecd wik" },
            { "field.dayperiod", "f\u1ecd m\u1ecd\u0301nin f\u1ecd \u00e1ftanun f\u1ecd \u00edvnin f\u1ecd nait" },
            { "field.hour", "Awa" },
            { "timezone.regionFormat", "{0} Taim" },
            { "timezone.regionFormat.daylight", "{0} D\u00e9la\u00edt Taim" },
            { "timezone.regionFormat.standard", "{0} F\u00edksd Taim" },
            { "field.minute", "M\u00ednit" },
            { "field.second", "S\u1eb9\u0301k\u1ecdn" },
            { "field.zone", "Ta\u00edm Zon" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "dd/MM/y",
                }
            },
            { "DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "PluralRules", "one:i = 0 or n = 1" },
            { "DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "buddhist.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "buddhist.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "buddhist.DateFormatItem.Gy", metaValue_buddhist_DateFormatItem_Gy },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "buddhist.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "buddhist.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "buddhist.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "buddhist.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "buddhist.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "buddhist.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "buddhist.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "buddhist.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "buddhist.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "buddhist.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "buddhist.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "japanese.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "japanese.DateFormatItem.Gy", metaValue_buddhist_DateFormatItem_Gy },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "japanese.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "japanese.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "japanese.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "japanese.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "japanese.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "japanese.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "japanese.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "japanese.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "japanese.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "japanese.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "japanese.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "japanese.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "japanese.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "roc.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "roc.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.Gy", metaValue_buddhist_DateFormatItem_Gy },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "roc.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "roc.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "roc.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "roc.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "roc.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "roc.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "roc.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "roc.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "roc.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "roc.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "roc.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "roc.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic.DateFormatItem.Gy", metaValue_buddhist_DateFormatItem_Gy },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "islamic.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "islamic.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "islamic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "islamic.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "islamic.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-civil.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-civil.DateFormatItem.Gy", metaValue_buddhist_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic-civil.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "islamic-civil.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic-civil.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic-civil.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "islamic-civil.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic-civil.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "islamic-civil.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "islamic-civil.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.Gy", metaValue_buddhist_DateFormatItem_Gy },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "islamic-umalqura.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "islamic-umalqura.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic-umalqura.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic-umalqura.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "islamic-umalqura.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-umalqura.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "islamic-umalqura.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "islamic-umalqura.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic-umalqura.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "calendarname.islamic-civil", "\u00cdsl\u00e1m Kal\u1eb9\u0301nda (T\u00e9b\u00fal\u00e1 Taip an S\u00edv\u00fal Taip)" },
            { "calendarname.islamic", "\u00cdsl\u00e1m Kal\u1eb9\u0301nda" },
            { "calendarname.buddhist", "B\u00fad\u00edst Kal\u1eb9\u0301nda" },
            { "calendarname.japanese", "Jap\u00e1n Kal\u1eb9\u0301nda" },
            { "calendarname.roc", "Rip\u1ecd\u0301bl\u00edk \u1ecdf Cha\u00edn\u00e1 Kal\u1eb9\u0301nda" },
            { "calendarname.islamic-umalqura", "\u00cdsl\u00e1m Kal\u1eb9\u0301nda (\u00damm al-K\u00fara)" },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00",
                    "#,##0%",
                    "\u00a4#,##0.00",
                }
            },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0K other:0K}",
                    "{one:00K other:00K}",
                    "{one:000K other:000K}",
                    "{one:0M other:0M}",
                    "{one:00M other:00M}",
                    "{one:000M other:000M}",
                    "{one:0B other:0B}",
                    "{one:00B other:00B}",
                    "{one:000B other:000B}",
                    "{one:0T other:0T}",
                    "{one:00T other:00T}",
                    "{one:000T other:000T}",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' 'Ta\u00fazan other:0' 'Ta\u00fazan}",
                    "{one:00' 'Ta\u00fazan other:00' 'Ta\u00fazan}",
                    "{one:000' 'Ta\u00fazan other:000' 'Ta\u00fazan}",
                    "{one:0' 'M\u00edli\u1ecdn other:0' 'M\u00edli\u1ecdn}",
                    "{one:00' 'M\u00edli\u1ecdn other:00' 'M\u00edli\u1ecdn}",
                    "{one:000' 'M\u00edli\u1ecdn other:000' 'M\u00edli\u1ecdn}",
                    "{one:0' 'B\u00edli\u1ecdn other:0' 'B\u00edli\u1ecdn}",
                    "{one:00' 'B\u00edli\u1ecdn other:00' 'B\u00edli\u1ecdn}",
                    "{one:000' 'B\u00edli\u1ecdn other:000' 'B\u00edli\u1ecdn}",
                    "{one:0' 'Tr\u00edli\u1ecdn other:0' 'Tr\u00edli\u1ecdn}",
                    "{one:00' 'Tr\u00edli\u1ecdn other:00' 'Tr\u00edli\u1ecdn}",
                    "{one:000' 'Tr\u00edli\u1ecdn other:000' 'Tr\u00edli\u1ecdn}",
                }
            },
        };
        return data;
    }
}
