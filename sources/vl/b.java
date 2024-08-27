package vl;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.google.android.gms.internal.p002firebaseauthapi.zzadd;
import com.google.android.gms.search.SearchAuth;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import e5.m;
import e5.p;
import h.u;
import is.d;
import is.e;
import iu.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.s;
import ll.o;
import m0.e1;
import m0.v0;
import m0.x0;
import m1.c;
import okhttp3.HttpUrl;
import s0.g;
import t0.n;
import t0.r;
import to.v;
import vt.i0;
import vt.p0;
import x1.t;
import z5.b0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Constructor f38171a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Method f38172b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f38173c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f38174d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f38175e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f38176f = "";

    public static final PublicKey A(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        byte[] decode = Base64.decode(s.n(s.n(s.n(key, "\n", HttpUrl.FRAGMENT_ENCODE_SET, false), "-----BEGIN PUBLIC KEY-----", HttpUrl.FRAGMENT_ENCODE_SET, false), "-----END PUBLIC KEY-----", HttpUrl.FRAGMENT_ENCODE_SET, false), 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        Intrinsics.checkNotNullExpressionValue(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    public static final String B(String kid) {
        Intrinsics.checkNotNullParameter(kid, "kid");
        URL url = new URL("https", Intrinsics.i(FacebookSdk.getFacebookDomain(), "www."), "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        z zVar = new z();
        FacebookSdk.getExecutor().execute(new a(url, zVar, kid, reentrantLock, newCondition, 0));
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) zVar.f20560a;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static int[] D(String str) {
        int i10;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i11 = indexOf4 + 2;
        if (i11 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i11) == '/') {
            i10 = str.indexOf(47, indexOf4 + 3);
            if (i10 == -1 || i10 > indexOf2) {
                i10 = indexOf2;
            }
        } else {
            i10 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i10;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void H(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static String I(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String type = context.getContentResolver().getType(uri);
        if (type != null && s.r(type, "image/", false)) {
            return "image";
        }
        String type2 = context.getContentResolver().getType(uri);
        if (type2 != null && s.r(type2, "video/", false)) {
            return "video";
        }
        return "document";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [is.e, is.d, java.lang.Object] */
    public static void W(fs.a aVar, d dVar) {
        ?? obj = new Object();
        e eVar = (e) dVar;
        obj.f20526a = eVar.f20526a;
        obj.f20527b = eVar.f20527b;
        obj.f20528c = dVar.a();
        obj.f20527b = 5;
        aVar.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList Z(e5.p r28) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.b.Z(e5.p):java.util.ArrayList");
    }

    public static final void a0(float[] fArr, float[] fArr2, int i10, float[] fArr3) {
        float n10;
        if (i10 != 0) {
            int i11 = 2 >= i10 ? i10 - 1 : 2;
            int i12 = i11 + 1;
            float[][] fArr4 = new float[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                fArr4[i13] = new float[i10];
            }
            for (int i14 = 0; i14 < i10; i14++) {
                fArr4[0][i14] = 1.0f;
                for (int i15 = 1; i15 < i12; i15++) {
                    fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
                }
            }
            float[][] fArr5 = new float[i12];
            for (int i16 = 0; i16 < i12; i16++) {
                fArr5[i16] = new float[i10];
            }
            float[][] fArr6 = new float[i12];
            for (int i17 = 0; i17 < i12; i17++) {
                fArr6[i17] = new float[i12];
            }
            for (int i18 = 0; i18 < i12; i18++) {
                float[] fArr7 = fArr5[i18];
                float[] fArr8 = fArr4[i18];
                for (int i19 = 0; i19 < i10; i19++) {
                    fArr7[i19] = fArr8[i19];
                }
                for (int i20 = 0; i20 < i18; i20++) {
                    float[] fArr9 = fArr5[i20];
                    float n11 = n(fArr7, fArr9);
                    for (int i21 = 0; i21 < i10; i21++) {
                        fArr7[i21] = fArr7[i21] - (fArr9[i21] * n11);
                    }
                }
                float sqrt = (float) Math.sqrt(n(fArr7, fArr7));
                if (sqrt >= 1.0E-6f) {
                    float f10 = 1.0f / sqrt;
                    for (int i22 = 0; i22 < i10; i22++) {
                        fArr7[i22] = fArr7[i22] * f10;
                    }
                    float[] fArr10 = fArr6[i18];
                    for (int i23 = 0; i23 < i12; i23++) {
                        if (i23 < i18) {
                            n10 = g.f34069a;
                        } else {
                            n10 = n(fArr7, fArr4[i23]);
                        }
                        fArr10[i23] = n10;
                    }
                } else {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
            }
            for (int i24 = i11; -1 < i24; i24--) {
                fArr3[i24] = n(fArr5[i24], fArr2);
                int i25 = i24 + 1;
                if (i25 <= i11) {
                    int i26 = i11;
                    while (true) {
                        fArr3[i24] = fArr3[i24] - (fArr6[i24][i26] * fArr3[i26]);
                        if (i26 != i25) {
                            i26--;
                        }
                    }
                }
                fArr3[i24] = fArr3[i24] / fArr6[i24][i24];
            }
            return;
        }
        throw new IllegalArgumentException("At least one point must be provided");
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static void b0() {
        if (f38171a == null || f38172b == null || f38173c == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            f38171a = cls.getConstructor(new Class[0]);
            f38172b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f38173c = cls.getMethod("build", new Class[0]);
        }
        if (f38174d == null || f38175e == null) {
            Class<?> cls2 = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            f38174d = cls2.getConstructor(new Class[0]);
            f38175e = cls2.getMethod("build", new Class[0]);
        }
    }

    public static final void c(y1.d dVar, t tVar) {
        if (t0.t.y(tVar)) {
            dVar.b();
        }
        boolean A = t0.t.A(tVar);
        long j10 = tVar.f39910b;
        if (!A) {
            List list = tVar.f39919k;
            if (list == null) {
                list = i0.f38321a;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                x1.d dVar2 = (x1.d) list.get(i10);
                long j11 = dVar2.f39836a;
                long j12 = dVar2.f39838c;
                dVar.f41062a.a(j11, c.d(j12));
                dVar.f41063b.a(j11, c.e(j12));
            }
            long j13 = tVar.f39920l;
            dVar.f41062a.a(j10, c.d(j13));
            dVar.f41063b.a(j10, c.e(j13));
        }
        if (t0.t.A(tVar) && j10 - dVar.f41064c > 40) {
            dVar.b();
        }
        dVar.f41064c = j10;
    }

    public static int c0(int i10, p pVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return pVar.u() + 1;
            case 7:
                return pVar.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static File d(ContextWrapper wrapper, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        File file = new File(wrapper.getDir("Images", 0), UUID.randomUUID() + ".jpg");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return file;
    }

    public static String d0(StringBuilder sb2, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i15 = i10;
        int i16 = i15;
        while (i15 <= i11) {
            if (i15 == i11) {
                i12 = i15;
            } else if (sb2.charAt(i15) == '/') {
                i12 = i15 + 1;
            } else {
                i15++;
            }
            int i17 = i16 + 1;
            if (i15 == i17 && sb2.charAt(i16) == '.') {
                sb2.delete(i16, i12);
                i11 -= i12 - i16;
            } else {
                if (i15 == i16 + 2 && sb2.charAt(i16) == '.' && sb2.charAt(i17) == '.') {
                    i13 = sb2.lastIndexOf("/", i16 - 2) + 1;
                    if (i13 > i10) {
                        i14 = i13;
                    } else {
                        i14 = i10;
                    }
                    sb2.delete(i14, i12);
                    i11 -= i12 - i14;
                } else {
                    i13 = i15 + 1;
                }
                i16 = i13;
            }
            i15 = i16;
        }
        return sb2.toString();
    }

    public static ArrayList e(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static String e0(String str, String str2) {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int[] D = D(str2);
        if (D[0] != -1) {
            sb2.append(str2);
            d0(sb2, D[1], D[2]);
            return sb2.toString();
        }
        int[] D2 = D(str);
        if (D[3] == 0) {
            sb2.append((CharSequence) str, 0, D2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (D[2] == 0) {
            sb2.append((CharSequence) str, 0, D2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i11 = D[1];
        if (i11 != 0) {
            int i12 = D2[0] + 1;
            sb2.append((CharSequence) str, 0, i12);
            sb2.append(str2);
            return d0(sb2, D[1] + i12, i12 + D[2]);
        }
        if (str2.charAt(i11) == '/') {
            sb2.append((CharSequence) str, 0, D2[1]);
            sb2.append(str2);
            int i13 = D2[1];
            return d0(sb2, i13, D[2] + i13);
        }
        int i14 = D2[0] + 2;
        int i15 = D2[1];
        if (i14 < i15 && i15 == D2[2]) {
            sb2.append((CharSequence) str, 0, i15);
            sb2.append('/');
            sb2.append(str2);
            int i16 = D2[1];
            return d0(sb2, i16, D[2] + i16 + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, D2[2] - 1);
        if (lastIndexOf == -1) {
            i10 = D2[1];
        } else {
            i10 = lastIndexOf + 1;
        }
        sb2.append((CharSequence) str, 0, i10);
        sb2.append(str2);
        return d0(sb2, D2[1], i10 + D[2]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r7 == r18.f42124f) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if ((r17.u() * com.google.android.gms.auth.api.credentials.CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        if (r4 == r1) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(e5.p r17, z5.u r18, int r19, mj.b r20) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.b.f(e5.p, z5.u, int, mj.b):boolean");
    }

    public static Uri f0(String str, String str2) {
        return Uri.parse(e0(str, str2));
    }

    public static void h(g5.t tVar) {
        if (tVar != null) {
            try {
                tVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void h0(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(h.n("csd-", i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void j(long j10, p pVar, b0[] b0VarArr) {
        int i10;
        int i11;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (pVar.a() > 1) {
                int i12 = 0;
                while (true) {
                    if (pVar.a() == 0) {
                        i10 = -1;
                        break;
                    }
                    int u10 = pVar.u();
                    i12 += u10;
                    if (u10 != 255) {
                        i10 = i12;
                        break;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (pVar.a() == 0) {
                        i13 = -1;
                        break;
                    }
                    int u11 = pVar.u();
                    i13 += u11;
                    if (u11 != 255) {
                        break;
                    }
                }
                int i14 = pVar.f15037b + i13;
                if (i13 != -1 && i13 <= pVar.a()) {
                    if (i10 == 4 && i13 >= 8) {
                        int u12 = pVar.u();
                        int z12 = pVar.z();
                        if (z12 == 49) {
                            i11 = pVar.g();
                        } else {
                            i11 = 0;
                        }
                        int u13 = pVar.u();
                        if (z12 == 47) {
                            pVar.G(1);
                        }
                        if (u12 == 181 && ((z12 == 49 || z12 == 47) && u13 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z12 == 49) {
                            if (i11 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            k(j10, pVar, b0VarArr);
                        }
                    }
                } else {
                    m.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i14 = pVar.f15038c;
                }
                pVar.F(i14);
            } else {
                return;
            }
        }
    }

    public static void k(long j10, p pVar, b0[] b0VarArr) {
        int u10 = pVar.u();
        if ((u10 & 64) != 0) {
            pVar.G(1);
            int i10 = (u10 & 31) * 3;
            int i11 = pVar.f15037b;
            for (b0 b0Var : b0VarArr) {
                pVar.F(i11);
                b0Var.c(i10, pVar);
                if (j10 != -9223372036854775807L) {
                    b0Var.b(j10, 1, i10, 0, null);
                }
            }
        }
    }

    public static float l(float f10, float f11, n nVar) {
        r rVar = (r) nVar;
        rVar.b0(-1528360391);
        long j10 = ((n1.t) rVar.m(e1.f26084a)).f28179a;
        if (!((v0) rVar.m(x0.f27075a)).e() ? androidx.compose.ui.graphics.a.t(j10) >= 0.5d : androidx.compose.ui.graphics.a.t(j10) <= 0.5d) {
            f10 = f11;
        }
        rVar.s(false);
        return f10;
    }

    public static final float n(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = g.f34069a;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static final boolean o(int i10, int i11) {
        return i10 == i11;
    }

    public static final void p0() {
        throw new UnsupportedOperationException();
    }

    public static String q(Context context, Uri uri, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final boolean q0(PublicKey publicKey, String data, String signature) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] decode = Base64.decode(signature, 8);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    public static float r(n nVar) {
        r rVar = (r) nVar;
        rVar.b0(621183615);
        float l10 = l(0.38f, 0.38f, rVar);
        rVar.s(false);
        return l10;
    }

    public static String t(fs.b bVar) {
        InetSocketAddress v10 = bVar.f16231d.v();
        if (v10 != null) {
            StringBuffer stringBuffer = new StringBuffer(90);
            stringBuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
            stringBuffer.append(v10.getPort());
            stringBuffer.append("\" /></cross-domain-policy>\u0000");
            return stringBuffer.toString();
        }
        throw new InvalidHandshakeException("socket not bound");
    }

    public static float u(n nVar) {
        r rVar = (r) nVar;
        rVar.b0(629162431);
        float l10 = l(1.0f, 0.87f, rVar);
        rVar.s(false);
        return l10;
    }

    public static float w(n nVar) {
        r rVar = (r) nVar;
        rVar.b0(1999054879);
        float l10 = l(0.74f, 0.6f, rVar);
        rVar.s(false);
        return l10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String x(android.content.Context r7, android.net.Uri r8) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            kotlin.jvm.internal.Intrinsics.c(r8)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r8
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            kotlin.jvm.internal.Intrinsics.c(r7)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L37
            r7.moveToFirst()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L37
            java.lang.String r8 = "_display_name"
            int r8 = r7.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L37
            java.lang.String r0 = r7.getString(r8)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L37
        L26:
            r7.close()
            goto L3a
        L2a:
            r8 = move-exception
            r0 = r7
            goto L31
        L2d:
            r8 = move-exception
            goto L31
        L2f:
            r7 = r0
            goto L37
        L31:
            if (r0 == 0) goto L36
            r0.close()
        L36:
            throw r8
        L37:
            if (r7 == 0) goto L3a
            goto L26
        L3a:
            if (r0 != 0) goto L3e
            java.lang.String r0 = "document"
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.b.x(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static long y(byte b10, byte b11) {
        int i10;
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? 2500 << r6 : i13 >= 12 ? SearchAuth.StatusCodes.AUTH_DISABLED << (i13 & 1) : (i13 & 3) == 3 ? 60000 : SearchAuth.StatusCodes.AUTH_DISABLED << r6);
    }

    public static String z(Context context, Uri uri) {
        Uri contentUri;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Cursor cursor = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            f38176f = x(context, uri);
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (Intrinsics.a("com.android.externalstorage.documents", uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                Intrinsics.c(documentId);
                String[] strArr = (String[]) new Regex(":").d(documentId).toArray(new String[0]);
                if (s.j("primary", strArr[0], true)) {
                    return a3.a.g(Environment.getExternalStorageDirectory().toString(), "/", strArr[1]);
                }
            } else {
                Intrinsics.checkNotNullParameter(uri, "uri");
                if (Intrinsics.a("com.android.providers.downloads.documents", uri.getAuthority())) {
                    DocumentsContract.getDocumentId(uri);
                    return dp.b.W0(context, uri).getPath();
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(uri, "uri");
                if (!Intrinsics.a(context.getContentResolver().getType(uri), "application/pdf")) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    if (!Intrinsics.a(context.getContentResolver().getType(uri), "text/plain")) {
                        Intrinsics.checkNotNullParameter(uri, "uri");
                        if (Intrinsics.a("com.android.providers.media.documents", uri.getAuthority())) {
                            String documentId2 = DocumentsContract.getDocumentId(uri);
                            Intrinsics.c(documentId2);
                            String[] strArr2 = (String[]) new Regex(":").d(documentId2).toArray(new String[0]);
                            String str = strArr2[0];
                            if (Intrinsics.a("image", str)) {
                                contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            } else if (Intrinsics.a("video", str)) {
                                contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            } else if (Intrinsics.a("audio", str)) {
                                contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                            } else {
                                contentUri = MediaStore.Files.getContentUri("external");
                            }
                            String[] strArr3 = {strArr2[1]};
                            Intrinsics.c(contentUri);
                            return q(context, contentUri, "_id=?", strArr3);
                        }
                    }
                }
                String uri2 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                if (s.r(uri2, "content://", false)) {
                    try {
                        Cursor query = context.getContentResolver().query(uri, null, null, null, null);
                        if (query != null) {
                            try {
                                if (query.moveToFirst()) {
                                    String path = dp.b.W0(context, uri).getPath();
                                    query.close();
                                    return path;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = query;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        if (query != null) {
                            query.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        } else {
            if (s.j("content", uri.getScheme(), true)) {
                return q(context, uri, null, null);
            }
            if (s.j("file", uri.getScheme(), true)) {
                return uri.getPath();
            }
        }
        return null;
    }

    public abstract Context C();

    public abstract float E(Object obj);

    public abstract void F();

    public boolean G() {
        return false;
    }

    public void J() {
    }

    public void K() {
    }

    public abstract boolean L(int i10, KeyEvent keyEvent);

    public boolean M(KeyEvent keyEvent) {
        return false;
    }

    public abstract void N(int i10, Object obj, m4.m mVar);

    public abstract void O(int i10, String str);

    public abstract void P();

    public abstract void Q();

    public abstract void R(Exception exc);

    public abstract void S();

    public abstract void T(String str);

    public abstract void U();

    public abstract void V(js.b bVar);

    public abstract void X();

    public boolean Y() {
        return false;
    }

    public boolean g() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.appsflyer.attribution.AppsFlyerRequestListener] */
    public void g0(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Object stockGroAnalyticsEventData = new Object();
        jj.a aVar = (jj.a) this;
        Intrinsics.checkNotNullParameter(stockGroAnalyticsEventData, "stockGroAnalyticsEventData");
        AppsFlyerLib appsFlyerLib = aVar.f21411h;
        if (appsFlyerLib != 0) {
            appsFlyerLib.logEvent(aVar.f21410g, eventName, p0.d(), new Object());
        }
    }

    public abstract boolean i();

    public abstract void i0(boolean z10);

    public abstract void j0();

    public abstract void k0(boolean z10);

    public abstract void l0(String str);

    public abstract void m(boolean z10);

    public abstract void m0(float f10, Object obj);

    public abstract void n0(CharSequence charSequence);

    public k.b o0(u uVar) {
        return null;
    }

    public abstract void p(float f10, float f11, v vVar);

    public abstract Task r0(String str);

    public abstract int s();

    public Task s0(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        q.h hVar;
        zzadd zzaddVar;
        o oVar = new o(this, 14);
        synchronized (firebaseAuth) {
            hVar = firebaseAuth.f11638l;
        }
        if (hVar != null && (zzaddVar = (zzadd) hVar.f31451c) != null && zzaddVar.zzc()) {
            return hVar.g(str, Boolean.FALSE, recaptchaAction).continueWithTask(oVar).continueWithTask(new com.google.firebase.messaging.t(str, hVar, recaptchaAction, oVar, 11));
        }
        return r0(null).continueWithTask(new h8.h(recaptchaAction, firebaseAuth, str, oVar, 11));
    }

    public abstract InetSocketAddress v();
}
