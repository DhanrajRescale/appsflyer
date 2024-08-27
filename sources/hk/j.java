package hk;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import ek.h0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class j implements xj.d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f18537a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f18538b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static ImageHeaderParser$ImageType d(i iVar) {
        try {
            int a10 = iVar.a();
            if (a10 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int b10 = (a10 << 8) | iVar.b();
            if (b10 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int b11 = (b10 << 8) | iVar.b();
            if (b11 == -1991225785) {
                iVar.skip(21L);
                try {
                    if (iVar.b() >= 3) {
                        return ImageHeaderParser$ImageType.PNG_A;
                    }
                    return ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (b11 != 1380533830) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            iVar.skip(4L);
            if (((iVar.a() << 16) | iVar.a()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int a11 = (iVar.a() << 16) | iVar.a();
            if ((a11 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i10 = a11 & 255;
            if (i10 == 88) {
                iVar.skip(4L);
                if ((iVar.b() & 16) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            if (i10 == 76) {
                iVar.skip(4L);
                if ((iVar.b() & 8) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            return ImageHeaderParser$ImageType.WEBP;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int e(xj.e eVar) {
        short b10;
        int a10;
        long j10;
        long skip;
        do {
            short b11 = eVar.b();
            if (b11 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) b11));
                }
                return -1;
            }
            b10 = eVar.b();
            if (b10 == 218) {
                return -1;
            }
            if (b10 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a10 = eVar.a() - 2;
            if (b10 != 225) {
                j10 = a10;
                skip = eVar.skip(j10);
            } else {
                return a10;
            }
        } while (skip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder q10 = da.e.q("Unable to skip enough data, type: ", b10, ", wanted to skip: ", a10, ", but actually skipped: ");
            q10.append(skip);
            Log.d("DfltImageHeaderParser", q10.toString());
        }
        return -1;
    }

    public static int f(xj.e eVar, byte[] bArr, int i10) {
        boolean z10;
        ByteOrder byteOrder;
        int i11;
        int i12;
        int c10 = eVar.c(i10, bArr);
        if (c10 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + c10);
            }
            return -1;
        }
        byte[] bArr2 = f18537a;
        if (bArr != null && i10 > bArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i13 = 0; i13 < bArr2.length; i13++) {
                if (bArr[i13] != bArr2[i13]) {
                    break;
                }
            }
        }
        if (z10) {
            h0 h0Var = new h0(bArr, i10);
            short h10 = h0Var.h(6);
            if (h10 != 18761) {
                if (h10 != 19789) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) h10));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ((ByteBuffer) h0Var.f15593b).order(byteOrder);
            if (((ByteBuffer) h0Var.f15593b).remaining() - 10 >= 4) {
                i11 = ((ByteBuffer) h0Var.f15593b).getInt(10);
            } else {
                i11 = -1;
            }
            short h11 = h0Var.h(i11 + 6);
            for (int i14 = 0; i14 < h11; i14++) {
                int i15 = (i14 * 12) + i11 + 8;
                short h12 = h0Var.h(i15);
                if (h12 == 274) {
                    short h13 = h0Var.h(i15 + 2);
                    if (h13 >= 1 && h13 <= 12) {
                        int i16 = i15 + 4;
                        if (((ByteBuffer) h0Var.f15593b).remaining() - i16 >= 4) {
                            i12 = ((ByteBuffer) h0Var.f15593b).getInt(i16);
                        } else {
                            i12 = -1;
                        }
                        if (i12 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder q10 = da.e.q("Got tagIndex=", i14, " tagType=", h12, " formatCode=");
                                q10.append((int) h13);
                                q10.append(" componentCount=");
                                q10.append(i12);
                                Log.d("DfltImageHeaderParser", q10.toString());
                            }
                            int i17 = i12 + f18538b[h13];
                            if (i17 > 4) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) h13));
                                }
                            } else {
                                int i18 = i15 + 8;
                                if (i18 >= 0 && i18 <= ((ByteBuffer) h0Var.f15593b).remaining()) {
                                    if (i17 >= 0 && i17 + i18 <= ((ByteBuffer) h0Var.f15593b).remaining()) {
                                        return h0Var.h(i18);
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) h12));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i18 + " tagType=" + ((int) h12));
                                }
                            }
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) h13));
                    }
                }
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // xj.d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            return d(new xj.f(byteBuffer));
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // xj.d
    public final ImageHeaderParser$ImageType b(InputStream inputStream) {
        if (inputStream != null) {
            return d(new xj.e(inputStream));
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // xj.d
    public final int c(InputStream inputStream, bk.h hVar) {
        if (inputStream != null) {
            xj.e eVar = new xj.e(inputStream);
            if (hVar != null) {
                try {
                    int a10 = eVar.a();
                    if ((a10 & 65496) != 65496 && a10 != 19789 && a10 != 18761) {
                        if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                            return -1;
                        }
                        Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a10);
                        return -1;
                    }
                    int e10 = e(eVar);
                    if (e10 == -1) {
                        if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                            return -1;
                        }
                        Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                        return -1;
                    }
                    byte[] bArr = (byte[]) hVar.c(e10, byte[].class);
                    try {
                        int f10 = f(eVar, bArr, e10);
                        hVar.g(bArr);
                        return f10;
                    } catch (Throwable th2) {
                        hVar.g(bArr);
                        throw th2;
                    }
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return -1;
                }
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }
}
