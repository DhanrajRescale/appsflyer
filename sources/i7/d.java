package i7;

import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import q6.l;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final x2.c f19711a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f19712b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f19713c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f19714d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f19715e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f19716f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f19717g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f19718h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f19719i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f19720j = {48, 48, 50, 0};

    public static byte[] a(b[] bVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (b bVar : bVarArr) {
            i11 += ((((bVar.f19708g * 2) + 7) & (-8)) / 8) + (bVar.f19706e * 2) + b(bVar.f19702a, bVar.f19703b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f19707f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, f19716f)) {
            int length = bVarArr.length;
            while (i10 < length) {
                b bVar2 = bVarArr[i10];
                m(byteArrayOutputStream, bVar2, b(bVar2.f19702a, bVar2.f19703b, bArr));
                o(byteArrayOutputStream, bVar2);
                l(byteArrayOutputStream, bVar2);
                n(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                m(byteArrayOutputStream, bVar3, b(bVar3.f19702a, bVar3.f19703b, bArr));
            }
            int length2 = bVarArr.length;
            while (i10 < length2) {
                b bVar4 = bVarArr[i10];
                o(byteArrayOutputStream, bVar4);
                l(byteArrayOutputStream, bVar4);
                n(byteArrayOutputStream, bVar4);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    public static String b(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = f19718h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f19717g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
            return str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            StringBuilder p10 = da.e.p(str);
            if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                str3 = ":";
            }
            return nn.d.o(p10, str3, str2);
        }
        if ("!".equals(obj)) {
            return str2.replace(":", "!");
        }
        if (":".equals(obj)) {
            return str2.replace("!", ":");
        }
        return str2;
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 4) {
                    return i11 + i12;
                }
                throw new IllegalStateException(jr.h.n("Unexpected flag: ", i10));
            }
            return i11;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    public static void d(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static int[] e(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += (int) l.t(byteArrayInputStream, 2);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static b[] f(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = f19719i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f19714d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int t10 = (int) l.t(fileInputStream, 1);
                    byte[] s7 = l.s(fileInputStream, (int) l.t(fileInputStream, 4), (int) l.t(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(s7);
                        try {
                            b[] g10 = g(byteArrayInputStream, t10, bVarArr);
                            byteArrayInputStream.close();
                            return g10;
                        } catch (Throwable th2) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, f19720j)) {
            int t11 = (int) l.t(fileInputStream, 2);
            byte[] s10 = l.s(fileInputStream, (int) l.t(fileInputStream, 4), (int) l.t(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(s10);
                try {
                    b[] h10 = h(byteArrayInputStream2, bArr2, t11, bVarArr);
                    byteArrayInputStream2.close();
                    return h10;
                } catch (Throwable th4) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    public static b[] g(ByteArrayInputStream byteArrayInputStream, int i10, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 == bVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int t10 = (int) l.t(byteArrayInputStream, 2);
                iArr[i11] = (int) l.t(byteArrayInputStream, 2);
                strArr[i11] = new String(l.r(byteArrayInputStream, t10), StandardCharsets.UTF_8);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                b bVar = bVarArr[i12];
                if (bVar.f19703b.equals(strArr[i12])) {
                    int i13 = iArr[i12];
                    bVar.f19706e = i13;
                    bVar.f19709h = e(byteArrayInputStream, i13);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] h(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, b[] bVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 == bVarArr.length) {
            for (int i11 = 0; i11 < i10; i11++) {
                l.t(byteArrayInputStream, 2);
                String str2 = new String(l.r(byteArrayInputStream, (int) l.t(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long t10 = l.t(byteArrayInputStream, 4);
                int t11 = (int) l.t(byteArrayInputStream, 2);
                b bVar = null;
                if (bVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i12 = 0;
                    while (true) {
                        if (i12 >= bVarArr.length) {
                            break;
                        }
                        if (bVarArr[i12].f19703b.equals(str)) {
                            bVar = bVarArr[i12];
                            break;
                        }
                        i12++;
                    }
                }
                if (bVar != null) {
                    bVar.f19705d = t10;
                    int[] e10 = e(byteArrayInputStream, t11);
                    if (Arrays.equals(bArr, f19718h)) {
                        bVar.f19706e = t11;
                        bVar.f19709h = e10;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f19715e)) {
            int t10 = (int) l.t(fileInputStream, 1);
            byte[] s7 = l.s(fileInputStream, (int) l.t(fileInputStream, 4), (int) l.t(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(s7);
                try {
                    b[] j10 = j(byteArrayInputStream, str, t10);
                    byteArrayInputStream.close();
                    return j10;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, String str, int i10) {
        TreeMap treeMap;
        int i11;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int t10 = (int) l.t(byteArrayInputStream, 2);
            int t11 = (int) l.t(byteArrayInputStream, 2);
            bVarArr[i12] = new b(str, new String(l.r(byteArrayInputStream, t10), StandardCharsets.UTF_8), l.t(byteArrayInputStream, 4), t11, (int) l.t(byteArrayInputStream, 4), (int) l.t(byteArrayInputStream, 4), new int[t11], new TreeMap());
        }
        for (int i13 = 0; i13 < i10; i13++) {
            b bVar = bVarArr[i13];
            int available = byteArrayInputStream.available() - bVar.f19707f;
            int i14 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.f19710i;
                if (available2 <= available) {
                    break;
                }
                i14 += (int) l.t(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i14), 1);
                for (int t12 = (int) l.t(byteArrayInputStream, 2); t12 > 0; t12--) {
                    l.t(byteArrayInputStream, 2);
                    int t13 = (int) l.t(byteArrayInputStream, 1);
                    if (t13 != 6 && t13 != 7) {
                        while (t13 > 0) {
                            l.t(byteArrayInputStream, 1);
                            for (int t14 = (int) l.t(byteArrayInputStream, 1); t14 > 0; t14--) {
                                l.t(byteArrayInputStream, 2);
                            }
                            t13--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                bVar.f19709h = e(byteArrayInputStream, bVar.f19706e);
                int i15 = bVar.f19708g;
                BitSet valueOf = BitSet.valueOf(l.r(byteArrayInputStream, (((i15 * 2) + 7) & (-8)) / 8));
                for (int i16 = 0; i16 < i15; i16++) {
                    if (valueOf.get(c(2, i16, i15))) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    if (valueOf.get(c(4, i16, i15))) {
                        i11 |= 4;
                    }
                    if (i11 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i16));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i16), Integer.valueOf(i11 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean k(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f19714d;
        int i10 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                l.z(byteArrayOutputStream2, bVarArr.length);
                int i11 = 2;
                int i12 = 2;
                for (b bVar : bVarArr) {
                    l.y(byteArrayOutputStream2, bVar.f19704c, 4);
                    l.y(byteArrayOutputStream2, bVar.f19705d, 4);
                    l.y(byteArrayOutputStream2, bVar.f19708g, 4);
                    String b10 = b(bVar.f19702a, bVar.f19703b, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = b10.getBytes(charset).length;
                    l.z(byteArrayOutputStream2, length2);
                    i12 = i12 + 14 + length2;
                    byteArrayOutputStream2.write(b10.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i12 == byteArray.length) {
                    h hVar = new h(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(hVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i13 = 0;
                    for (int i14 = 0; i14 < bVarArr.length; i14++) {
                        try {
                            b bVar2 = bVarArr[i14];
                            l.z(byteArrayOutputStream3, i14);
                            l.z(byteArrayOutputStream3, bVar2.f19706e);
                            i13 = i13 + 4 + (bVar2.f19706e * 2);
                            l(byteArrayOutputStream3, bVar2);
                        } catch (Throwable th2) {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i13 == byteArray2.length) {
                        h hVar2 = new h(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(hVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < bVarArr.length) {
                            try {
                                b bVar3 = bVarArr[i15];
                                Iterator it = bVar3.f19710i.entrySet().iterator();
                                int i17 = i10;
                                while (it.hasNext()) {
                                    i17 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    n(byteArrayOutputStream4, bVar3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        o(byteArrayOutputStream4, bVar3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        l.z(byteArrayOutputStream3, i15);
                                        int length3 = byteArray3.length + i11 + byteArray4.length;
                                        int i18 = i16 + 6;
                                        ArrayList arrayList4 = arrayList3;
                                        l.y(byteArrayOutputStream3, length3, 4);
                                        l.z(byteArrayOutputStream3, i17);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i16 = i18 + length3;
                                        i15++;
                                        arrayList3 = arrayList4;
                                        i10 = 0;
                                        i11 = 2;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i16 == byteArray5.length) {
                            h hVar3 = new h(4, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(hVar3);
                            long j10 = 4;
                            long size = j10 + j10 + 4 + (arrayList2.size() * 16);
                            l.y(byteArrayOutputStream, arrayList2.size(), 4);
                            int i19 = 0;
                            while (i19 < arrayList2.size()) {
                                h hVar4 = (h) arrayList2.get(i19);
                                l.y(byteArrayOutputStream, da.e.d(hVar4.f19728a), 4);
                                l.y(byteArrayOutputStream, size, 4);
                                boolean z10 = hVar4.f19730c;
                                byte[] bArr3 = hVar4.f19729b;
                                if (z10) {
                                    long length4 = bArr3.length;
                                    byte[] g10 = l.g(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(g10);
                                    l.y(byteArrayOutputStream, g10.length, 4);
                                    l.y(byteArrayOutputStream, length4, 4);
                                    length = g10.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    l.y(byteArrayOutputStream, bArr3.length, 4);
                                    l.y(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i19++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i20));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream2.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        }
        byte[] bArr4 = f19715e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] a10 = a(bVarArr, bArr4);
            l.y(byteArrayOutputStream, bVarArr.length, 1);
            l.y(byteArrayOutputStream, a10.length, 4);
            byte[] g11 = l.g(a10);
            l.y(byteArrayOutputStream, g11.length, 4);
            byteArrayOutputStream.write(g11);
            return true;
        }
        byte[] bArr5 = f19717g;
        if (Arrays.equals(bArr, bArr5)) {
            l.y(byteArrayOutputStream, bVarArr.length, 1);
            for (b bVar4 : bVarArr) {
                int size2 = bVar4.f19710i.size() * 4;
                String b11 = b(bVar4.f19702a, bVar4.f19703b, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                l.z(byteArrayOutputStream, b11.getBytes(charset2).length);
                l.z(byteArrayOutputStream, bVar4.f19709h.length);
                l.y(byteArrayOutputStream, size2, 4);
                l.y(byteArrayOutputStream, bVar4.f19704c, 4);
                byteArrayOutputStream.write(b11.getBytes(charset2));
                Iterator it2 = bVar4.f19710i.keySet().iterator();
                while (it2.hasNext()) {
                    l.z(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    l.z(byteArrayOutputStream, 0);
                }
                for (int i21 : bVar4.f19709h) {
                    l.z(byteArrayOutputStream, i21);
                }
            }
            return true;
        }
        byte[] bArr6 = f19716f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] a11 = a(bVarArr, bArr6);
            l.y(byteArrayOutputStream, bVarArr.length, 1);
            l.y(byteArrayOutputStream, a11.length, 4);
            byte[] g12 = l.g(a11);
            l.y(byteArrayOutputStream, g12.length, 4);
            byteArrayOutputStream.write(g12);
            return true;
        }
        byte[] bArr7 = f19718h;
        if (Arrays.equals(bArr, bArr7)) {
            l.z(byteArrayOutputStream, bVarArr.length);
            for (b bVar5 : bVarArr) {
                String b12 = b(bVar5.f19702a, bVar5.f19703b, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                l.z(byteArrayOutputStream, b12.getBytes(charset3).length);
                TreeMap treeMap = bVar5.f19710i;
                l.z(byteArrayOutputStream, treeMap.size());
                l.z(byteArrayOutputStream, bVar5.f19709h.length);
                l.y(byteArrayOutputStream, bVar5.f19704c, 4);
                byteArrayOutputStream.write(b12.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    l.z(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i22 : bVar5.f19709h) {
                    l.z(byteArrayOutputStream, i22);
                }
            }
            return true;
        }
        return false;
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i10 = 0;
        for (int i11 : bVar.f19709h) {
            Integer valueOf = Integer.valueOf(i11);
            l.z(byteArrayOutputStream, valueOf.intValue() - i10);
            i10 = valueOf.intValue();
        }
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        l.z(byteArrayOutputStream, str.getBytes(charset).length);
        l.z(byteArrayOutputStream, bVar.f19706e);
        l.y(byteArrayOutputStream, bVar.f19707f, 4);
        l.y(byteArrayOutputStream, bVar.f19704c, 4);
        l.y(byteArrayOutputStream, bVar.f19708g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((bVar.f19708g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f19710i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i10 = intValue2 & 2;
            int i11 = bVar.f19708g;
            if (i10 != 0) {
                int c10 = c(2, intValue, i11);
                int i12 = c10 / 8;
                bArr[i12] = (byte) ((1 << (c10 % 8)) | bArr[i12]);
            }
            if ((intValue2 & 4) != 0) {
                int c11 = c(4, intValue, i11);
                int i13 = c11 / 8;
                bArr[i13] = (byte) ((1 << (c11 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void o(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i10 = 0;
        for (Map.Entry entry : bVar.f19710i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                l.z(byteArrayOutputStream, intValue - i10);
                l.z(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }
}
