package bv;

import com.airbnb.deeplinkdispatch.MetadataMasks;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes2.dex */
public class m implements Serializable, Comparable {

    /* renamed from: d */
    public static final m f7367d = new m(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final byte[] f7368a;

    /* renamed from: b */
    public transient int f7369b;

    /* renamed from: c */
    public transient String f7370c;

    public m(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f7368a = data;
    }

    public static int g(m mVar, m other) {
        mVar.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return mVar.f(0, other.f7368a);
    }

    public static int k(m mVar, m other) {
        mVar.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return mVar.j(-1234567890, other.f7368a);
    }

    public static /* synthetic */ m o(m mVar, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = -1234567890;
        }
        return mVar.n(i10, i11);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        Intrinsics.checkNotNullParameter(objectInputStream, "<this>");
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i10 = 0;
            while (i10 < readInt) {
                int read = objectInputStream.read(bArr, i10, readInt - i10);
                if (read != -1) {
                    i10 += read;
                } else {
                    throw new EOFException();
                }
            }
            m mVar = new m(bArr);
            Field declaredField = m.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            declaredField.set(this, mVar.f7368a);
            return;
        }
        throw new IllegalArgumentException(jr.h.n("byteCount < 0: ", readInt).toString());
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f7368a.length);
        objectOutputStream.write(this.f7368a);
    }

    public String a() {
        byte[] bArr = this.f7368a;
        byte[] map = a.f7318a;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i10 + 2;
            byte b11 = bArr[i10 + 1];
            i10 += 3;
            byte b12 = bArr[i12];
            bArr2[i11] = map[(b10 & 255) >> 2];
            bArr2[i11 + 1] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr2[i11 + 2] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 += 4;
            bArr2[i13] = map[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i14 = i10 + 1;
                byte b13 = bArr[i10];
                byte b14 = bArr[i14];
                bArr2[i11] = map[(b13 & 255) >> 2];
                bArr2[i11 + 1] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
                bArr2[i11 + 2] = map[(b14 & 15) << 2];
                bArr2[i11 + 3] = 61;
            }
        } else {
            byte b15 = bArr[i10];
            bArr2[i11] = map[(b15 & 255) >> 2];
            bArr2[i11 + 1] = map[(b15 & 3) << 4];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
        }
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        return new String(bArr2, Charsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 < r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L29;
     */
    @Override // java.lang.Comparable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(bv.m r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.d()
            int r1 = r10.d()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.i(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.i(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.m.compareTo(bv.m):int");
    }

    public m c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f7368a, 0, d());
        byte[] digest = messageDigest.digest();
        Intrinsics.c(digest);
        return new m(digest);
    }

    public int d() {
        return this.f7368a.length;
    }

    public String e() {
        byte[] bArr = this.f7368a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = cv.b.f13080a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            int d10 = mVar.d();
            byte[] bArr = this.f7368a;
            if (d10 == bArr.length && mVar.m(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i10, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = this.f7368a.length - other.length;
        int max = Math.max(i10, 0);
        if (max <= length) {
            while (!b.a(this.f7368a, max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] h() {
        return this.f7368a;
    }

    public int hashCode() {
        int i10 = this.f7369b;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f7368a);
            this.f7369b = hashCode;
            return hashCode;
        }
        return i10;
    }

    public byte i(int i10) {
        return this.f7368a[i10];
    }

    public int j(int i10, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int min = Math.min(b.c(this, i10), this.f7368a.length - other.length); -1 < min; min--) {
            if (b.a(this.f7368a, min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i10, m other, int i11) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.m(0, this.f7368a, i10, i11);
    }

    public boolean m(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 >= 0) {
            byte[] bArr = this.f7368a;
            if (i10 <= bArr.length - i12 && i11 >= 0 && i11 <= other.length - i12 && b.a(bArr, i10, other, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public m n(int i10, int i11) {
        int c10 = b.c(this, i11);
        if (i10 >= 0) {
            byte[] bArr = this.f7368a;
            if (c10 <= bArr.length) {
                if (c10 - i10 >= 0) {
                    if (i10 == 0 && c10 == bArr.length) {
                        return this;
                    }
                    return new m(vt.t.i(bArr, i10, c10));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(a3.a.i(new StringBuilder("endIndex > length("), this.f7368a.length, ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public m p() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f7368a;
            if (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (b10 >= 65 && b10 <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    copyOf[i10] = (byte) (b10 + MetadataMasks.ConfigurablePathSegmentMask);
                    for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                        byte b11 = copyOf[i11];
                        if (b11 >= 65 && b11 <= 90) {
                            copyOf[i11] = (byte) (b11 + MetadataMasks.ConfigurablePathSegmentMask);
                        }
                    }
                    return new m(copyOf);
                }
                i10++;
            } else {
                return this;
            }
        }
    }

    public final String q() {
        String str = this.f7370c;
        if (str == null) {
            byte[] h10 = h();
            Intrinsics.checkNotNullParameter(h10, "<this>");
            String str2 = new String(h10, Charsets.UTF_8);
            this.f7370c = str2;
            return str2;
        }
        return str;
    }

    public void r(j buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.X(this.f7368a, 0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x00ea, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0124, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0128, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00ca, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0167, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x016e, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0160, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01a1, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01a4, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01a7, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0134, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01aa, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008b, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b8, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007a, code lost:
    
        if (r6 == 64) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f2, code lost:
    
        if (r6 == 64) goto L431;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.m.toString():java.lang.String");
    }
}
