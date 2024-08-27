package e5;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import androidx.media3.common.ParserException;
import b5.q0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import lp.j1;
import lp.l0;
import lp.o0;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Connection;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f14999a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f15000b = {HttpUrl.FRAGMENT_ENCODE_SET, "A", "B", "C"};

    public static void a(String str) {
        if (x.f15050a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b(int i10, int i11) {
        GLES20.glBindTexture(i10, i11);
        f();
        GLES20.glTexParameteri(i10, 10240, 9729);
        f();
        GLES20.glTexParameteri(i10, 10241, 9729);
        f();
        GLES20.glTexParameteri(i10, 10242, 33071);
        f();
        GLES20.glTexParameteri(i10, 10243, 33071);
        f();
    }

    public static String c(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        char c10;
        Object[] objArr = new Object[5];
        objArr[0] = f15000b[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        if (z10) {
            c10 = 'H';
        } else {
            c10 = 'L';
        }
        objArr[3] = Character.valueOf(c10);
        objArr[4] = Integer.valueOf(i13);
        int i14 = x.f15050a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static byte[] d(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i10;
        int i11;
        if (bArr != null) {
            i10 = bArr.length;
        } else {
            i10 = 0;
        }
        int i12 = i10 + 32;
        if (uuidArr != null) {
            i12 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i12);
        allocate.putInt(i12);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i11 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        } else {
            i11 = 0;
        }
        allocate.putInt(i11);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static void e(String str, boolean z10) {
        if (z10) {
        } else {
            throw ParserException.a(str, null);
        }
    }

    public static void f() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z10 = true;
        }
        if (!z10) {
        } else {
            throw new Exception(sb2.toString());
        }
    }

    public static void g(String str, boolean z10) {
        if (z10) {
        } else {
            throw new Exception(str);
        }
    }

    public static FloatBuffer h(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void i() {
        if (x.f15050a >= 18) {
            Trace.endSection();
        }
    }

    public static j1 j(b5.j jVar, ArrayList arrayList) {
        l0 l0Var = o0.f25025b;
        kp.j.A(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (i10 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            b5.k c10 = jVar.c(bundle);
            c10.getClass();
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, bl.j.z(objArr.length, i12));
            } else if (z10) {
                objArr = (Object[]) objArr.clone();
            } else {
                objArr[i11] = c10;
                i10++;
                i11++;
            }
            z10 = false;
            objArr[i11] = c10;
            i10++;
            i11++;
        }
        return o0.o(i11, objArr);
    }

    public static String k(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static int l(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static boolean m(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean n(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean o(XmlPullParser xmlPullParser, String str) {
        if (n(xmlPullParser) && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static l0.j p(byte[] bArr) {
        p pVar = new p(bArr);
        if (pVar.f15038c < 32) {
            return null;
        }
        pVar.F(0);
        if (pVar.g() != pVar.a() + 4 || pVar.g() != 1886614376) {
            return null;
        }
        int h10 = h5.a.h(pVar.g());
        if (h10 > 1) {
            nn.d.u("Unsupported pssh version: ", h10, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(pVar.o(), pVar.o());
        if (h10 == 1) {
            pVar.G(pVar.x() * 16);
        }
        int x10 = pVar.x();
        if (x10 != pVar.a()) {
            return null;
        }
        ?? r22 = new byte[x10];
        pVar.e(r22, 0, x10);
        return new l0.j(uuid, h10, (Serializable) r22);
    }

    public static byte[] q(UUID uuid, byte[] bArr) {
        l0.j p10 = p(bArr);
        if (p10 == null) {
            return null;
        }
        Object obj = p10.f23774b;
        if (!uuid.equals((UUID) obj)) {
            m.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + ((UUID) obj) + ".");
            return null;
        }
        return (byte[]) p10.f23775c;
    }

    public static q0 r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = x.f15050a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                m.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(i6.a.a(new p(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    m.g("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new i6.b(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new q0(arrayList);
    }

    public static tr.e s(p pVar) {
        pVar.G(1);
        int w10 = pVar.w();
        long j10 = pVar.f15037b + w10;
        int i10 = w10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long o10 = pVar.o();
            if (o10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = o10;
            jArr2[i11] = pVar.o();
            pVar.G(2);
            i11++;
        }
        pVar.G((int) (j10 - pVar.f15037b));
        return new tr.e(16, jArr, jArr2);
    }

    public static l0.j t(p pVar, boolean z10, boolean z11) {
        if (z10) {
            u(3, pVar, false);
        }
        String s7 = pVar.s((int) pVar.l(), kp.e.f23433c);
        int length = s7.length();
        long l10 = pVar.l();
        String[] strArr = new String[(int) l10];
        int i10 = length + 15;
        for (int i11 = 0; i11 < l10; i11++) {
            String s10 = pVar.s((int) pVar.l(), kp.e.f23433c);
            strArr[i11] = s10;
            i10 = i10 + 4 + s10.length();
        }
        if (z11 && (pVar.u() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new l0.j(i10 + 1, s7, strArr);
    }

    public static boolean u(int i10, p pVar, boolean z10) {
        if (pVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw ParserException.a("too short header: " + pVar.a(), null);
        }
        if (pVar.u() != i10) {
            if (z10) {
                return false;
            }
            throw ParserException.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (pVar.u() == 118 && pVar.u() == 111 && pVar.u() == 114 && pVar.u() == 98 && pVar.u() == 105 && pVar.u() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }
}
