/*
 * Copyright 2002-2012 Drew Noakes
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 * More information about this project is available at:
 *
 *    http://drewnoakes.com/code/exif/
 *    http://code.google.com/p/metadata-extractor/
 */
package com.drew.imaging.jpeg;

/**
 * An enumeration of the known segment types found in JPEG files.
 *
 * @author  Drew Noakes http://drewnoakes.com
 */
public enum JpegSegmentType
{
    /** APP0 JPEG segment identifier -- JFIF data (also JFXX apparently). */
    APP0((byte)0xE0),

    /** APP1 JPEG segment identifier -- where Exif data is kept.  XMP data is also kept in here, though usually in a second instance. */
    APP1((byte)0xE1),

    /** APP2 JPEG segment identifier. */
    APP2((byte)0xE2),

    /** APP3 JPEG segment identifier. */
    APP3((byte)0xE3),

    /** APP4 JPEG segment identifier. */
    APP4((byte)0xE4),

    /** APP5 JPEG segment identifier. */
    APP5((byte)0xE5),

    /** APP6 JPEG segment identifier. */
    APP6((byte)0xE6),

    /** APP7 JPEG segment identifier. */
    APP7((byte)0xE7),

    /** APP8 JPEG segment identifier. */
    APP8((byte)0xE8),

    /** APP9 JPEG segment identifier. */
    APP9((byte)0xE9),

    /** APPA (App10) JPEG segment identifier -- can hold Unicode comments. */
    APPA((byte)0xEA),

    /** APPB (App11) JPEG segment identifier. */
    APPB((byte)0xEB),

    /** APPC (App12) JPEG segment identifier. */
    APPC((byte)0xEC),

    /** APPD (App13) JPEG segment identifier -- IPTC data in here. */
    APPD((byte)0xED),

    /** APPE (App14) JPEG segment identifier. */
    APPE((byte)0xEE),

    /** APPF (App15) JPEG segment identifier. */
    APPF((byte)0xEF),

    /** Start Of Image segment identifier. */
    SOI((byte)0xD8),

    /** Define Quantization Table segment identifier. */
    DQT((byte)0xDB),

    /** Define Huffman Table segment identifier. */
    DHT((byte)0xC4),

    /** Start-of-Frame (0) segment identifier. */
    SOF0((byte)0xC0),

    /** Start-of-Frame (1) segment identifier. */
    SOF1((byte)0xC1),

    /** Start-of-Frame (2) segment identifier. */
    SOF2((byte)0xC2),

    /** Start-of-Frame (3) segment identifier. */
    SOF3((byte)0xC3),

//    /** Start-of-Frame (4) segment identifier. */
//    SOF4((byte)0xC4),

    /** Start-of-Frame (5) segment identifier. */
    SOF5((byte)0xC5),

    /** Start-of-Frame (6) segment identifier. */
    SOF6((byte)0xC6),

    /** Start-of-Frame (7) segment identifier. */
    SOF7((byte)0xC7),

    /** Start-of-Frame (8) segment identifier. */
    SOF8((byte)0xC8),

    /** Start-of-Frame (9) segment identifier. */
    SOF9((byte)0xC9),

    /** Start-of-Frame (10) segment identifier. */
    SOF10((byte)0xCA),

    /** Start-of-Frame (11) segment identifier. */
    SOF11((byte)0xCB),

//    /** Start-of-Frame (12) segment identifier. */
//    SOF12((byte)0xCC),

    /** Start-of-Frame (13) segment identifier. */
    SOF13((byte)0xCD),

    /** Start-of-Frame (14) segment identifier. */
    SOF14((byte)0xCE),

    /** Start-of-Frame (15) segment identifier. */
    SOF15((byte)0xCF),

    /** JPEG comment segment identifier. */
    COM((byte)0xFE);

    public final byte byteValue;

    JpegSegmentType(byte b)
    {
        byteValue = b;
    }
}