package x9;

import ak.e0;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c4.e;
import com.assetgro.stockgro.ui.main.lvl.licensing.ValidationException;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import e.l;
import ea.p0;
import ek.u;
import hk.v;
import j9.h0;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import jn.i;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import nv.c0;
import nv.j;
import nv.p;
import nv.w0;
import nv.x0;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import pq.f;
import xj.k;

/* loaded from: classes.dex */
public class c implements xs.b, kk.a, e, ep.c, j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40137a;

    /* renamed from: b, reason: collision with root package name */
    public Object f40138b;

    /* renamed from: c, reason: collision with root package name */
    public Object f40139c;

    /* renamed from: d, reason: collision with root package name */
    public Object f40140d;

    public /* synthetic */ c(int i10, Object obj, Object obj2, Object obj3) {
        this.f40137a = i10;
        this.f40138b = obj;
        this.f40139c = obj2;
        this.f40140d = obj3;
    }

    @Override // nv.j
    public final Object a(c0 c0Var) {
        Executor executor = (Executor) this.f40139c;
        if (executor != null) {
            return new p(executor, c0Var);
        }
        return c0Var;
    }

    @Override // c4.e
    public final boolean b(Object obj) {
        if (obj instanceof sk.b) {
            ((sk.b) obj).e().f34671a = true;
        }
        ((sk.c) this.f40139c).k(obj);
        return ((e) this.f40140d).b(obj);
    }

    @Override // c4.e
    public final Object c() {
        Object c10 = ((e) this.f40140d).c();
        if (c10 == null) {
            c10 = ((sk.a) this.f40138b).j();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + c10.getClass());
            }
        }
        if (c10 instanceof sk.b) {
            ((sk.b) c10).e().f34671a = false;
        }
        return c10;
    }

    @Override // nv.j
    public final Type d() {
        return (Type) this.f40138b;
    }

    public final i e() {
        String str;
        if (((String) this.f40138b) == null) {
            str = " backendName";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (((gn.c) this.f40140d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new i((String) this.f40138b, (byte[]) this.f40139c, (gn.c) this.f40140d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final on.b f() {
        String str;
        if (((Long) this.f40138b) == null) {
            str = " delta";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (((Long) this.f40139c) == null) {
            str = str.concat(" maxAllowedDelay");
        }
        if (((Set) this.f40140d) == null) {
            str = h.r(str, " flags");
        }
        if (str.isEmpty()) {
            return new on.b(((Long) this.f40138b).longValue(), ((Long) this.f40139c).longValue(), (Set) this.f40140d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final pq.b g() {
        String str;
        if (((Long) this.f40139c) == null) {
            str = " tokenExpirationTimestamp";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str.isEmpty()) {
            return new pq.b((String) this.f40138b, ((Long) this.f40139c).longValue(), (f) this.f40140d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p0 p0Var = (p0) this.f40138b;
        ov.a gsonConverterFactory = (ov.a) ((Provider) this.f40139c).get();
        OkHttpClient okHttpClient = (OkHttpClient) ((Provider) this.f40140d).get();
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        w0 w0Var = new w0();
        w0Var.a();
        ArrayList arrayList = w0Var.f29310d;
        Objects.requireNonNull(gsonConverterFactory, "factory == null");
        arrayList.add(gsonConverterFactory);
        Objects.requireNonNull(okHttpClient, "client == null");
        w0Var.f29308b = okHttpClient;
        x0 b10 = w0Var.b();
        Intrinsics.checkNotNullExpressionValue(b10, "build(...)");
        return b10;
    }

    public final Bitmap h(BitmapFactory.Options options) {
        switch (this.f40137a) {
            case 4:
                v vVar = (v) ((t9.c) this.f40138b).f35633b;
                vVar.reset();
                return BitmapFactory.decodeStream(vVar, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((l) this.f40140d).l().getFileDescriptor(), null, options);
        }
    }

    public final void i(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.f40138b;
        iq.f fVar = new iq.f(byteArrayOutputStream, map, (Map) this.f40139c, (fq.d) this.f40140d);
        if (obj != null) {
            fq.d dVar = (fq.d) map.get(obj.getClass());
            if (dVar != null) {
                dVar.encode(obj, fVar);
            } else {
                throw new RuntimeException("No encoder for " + obj.getClass());
            }
        }
    }

    public final ImageHeaderParser$ImageType j() {
        v vVar;
        switch (this.f40137a) {
            case 4:
                List list = (List) this.f40140d;
                v vVar2 = (v) ((t9.c) this.f40138b).f35633b;
                vVar2.reset();
                return al.d.s0((bk.h) this.f40139c, vVar2, list);
            default:
                List list2 = (List) this.f40139c;
                l lVar = (l) this.f40140d;
                bk.h hVar = (bk.h) this.f40138b;
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    xj.d dVar = (xj.d) list2.get(i10);
                    v vVar3 = null;
                    try {
                        vVar = new v(new FileInputStream(lVar.l().getFileDescriptor()), hVar);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        ImageHeaderParser$ImageType b10 = dVar.b(vVar);
                        try {
                            vVar.close();
                        } catch (IOException unused) {
                        }
                        lVar.l();
                        if (b10 != ImageHeaderParser$ImageType.UNKNOWN) {
                            return b10;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        vVar3 = vVar;
                        if (vVar3 != null) {
                            try {
                                vVar3.close();
                            } catch (IOException unused2) {
                            }
                        }
                        lVar.l();
                        throw th;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public final String k(String str, String str2) {
        String string = ((SharedPreferences) this.f40138b).getString(str, null);
        if (string != null) {
            try {
                return ((of.a) ((of.f) this.f40139c)).a(string, str);
            } catch (ValidationException unused) {
                Log.w("PreferenceObfuscator", "Validation error while reading preference: ".concat(str));
                return str2;
            }
        }
        return str2;
    }

    @Override // kk.a
    public final e0 l(e0 e0Var, k kVar) {
        Drawable drawable = (Drawable) e0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((kk.a) this.f40139c).l(hk.c.e(((BitmapDrawable) drawable).getBitmap(), (bk.d) this.f40138b), kVar);
        }
        if (drawable instanceof jk.c) {
            return ((kk.a) this.f40140d).l(e0Var, kVar);
        }
        return null;
    }

    public Object m(b bVar) {
        return this.f40140d;
    }

    public final Object n(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        b bVar = (b) this.f40138b;
        bVar.f40130a = f10;
        bVar.f40131b = f11;
        bVar.f40132c = obj;
        bVar.f40133d = obj2;
        bVar.f40134e = f12;
        bVar.f40135f = f13;
        bVar.f40136g = f14;
        return m(bVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(80:5|(4:7|(1:9)|10|(2:12|(2:13|(2:15|(3:17|18|(1:20)(0))(1:21))(1:22)))(0))(0)|23|(77:244|245|(1:27)|28|29|30|(1:32)|241|34|35|(3:216|217|(72:219|(64:221|(1:223)|38|(1:40)|41|(1:43)|44|(55:46|(1:201)|50|(1:52)|53|(1:55)(2:191|(1:196)(1:195))|56|(1:58)|59|(1:61)(5:179|(1:181)|182|(1:184)(1:190)|(1:186)(2:187|(1:189)))|62|(1:64)(6:161|(4:164|(2:172|173)(1:170)|171|162)|174|175|(1:177)|178)|65|(1:67)(1:160)|(1:69)|70|(37:156|157|(1:76)|77|(1:79)|80|(31:147|(1:151)|(1:84)|85|(27:142|(1:146)|(1:89)|90|(23:139|(1:141)|(1:94)|95|(1:97)|98|(1:100)|101|(3:103|(1:108)(1:106)|107)|109|(1:111)|112|(1:114)|115|(1:117)|118|(1:138)|120|(4:127|128|(1:130)(1:133)|131)|122|(1:124)|125|126)|92|(0)|95|(0)|98|(0)|101|(0)|109|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|87|(0)|90|(0)|92|(0)|95|(0)|98|(0)|101|(0)|109|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|98|(0)|101|(0)|109|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|72|(37:152|153|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|98|(0)|101|(0)|109|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|98|(0)|101|(0)|109|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|202|(2:211|212)|(1:210)(1:209)|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|98|(0)|101|(0)|109|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|224|(67:226|(1:228)|38|(0)|41|(0)|44|(0)|202|(1:204)|211|212|(1:207)|210|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|98|(0)|101|(0)|109|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)(1:237)|229|(3:231|(1:233)(1:235)|234)|236|38|(0)|41|(0)|44|(0)|202|(0)|211|212|(0)|210|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|98|(0)|101|(0)|109|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126))|37|38|(0)|41|(0)|44|(0)|202|(0)|211|212|(0)|210|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|98|(0)|101|(0)|109|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126)|25|(0)|28|29|30|(0)|241|34|35|(0)|37|38|(0)|41|(0)|44|(0)|202|(0)|211|212|(0)|210|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|98|(0)|101|(0)|109|(0)|112|(0)|115|(0)|118|(0)|120|(0)|122|(0)|125|126) */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0214, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0215, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x00d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x00d4, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0532 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd A[Catch: NameNotFoundException -> 0x00d3, TRY_LEAVE, TryCatch #6 {NameNotFoundException -> 0x00d3, blocks: (B:30:0x00c7, B:32:0x00cd), top: B:29:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04ae  */
    /* JADX WARN: Type inference failed for: r0v109, types: [int] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185 */
    /* JADX WARN: Type inference failed for: r0v186 */
    /* JADX WARN: Type inference failed for: r14v1, types: [q3.d0] */
    /* JADX WARN: Type inference failed for: r5v36, types: [q3.f0, q3.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o() {
        /*
            Method dump skipped, instructions count: 1461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.c.o():boolean");
    }

    public final void p(String str, String str2) {
        String c10;
        if (((SharedPreferences.Editor) this.f40140d) == null) {
            this.f40140d = ((SharedPreferences) this.f40138b).edit();
        }
        of.a aVar = (of.a) ((of.f) this.f40139c);
        aVar.getClass();
        if (str2 == null) {
            c10 = null;
        } else {
            try {
                c10 = pf.a.c(aVar.f29974a.doFinal(("com.google.android.vending.licensing.AESObfuscator-1|" + str + str2).getBytes(StandardCharsets.UTF_8)));
            } catch (GeneralSecurityException e10) {
                throw new RuntimeException("Invalid environment", e10);
            }
        }
        ((SharedPreferences.Editor) this.f40140d).putString(str, c10);
    }

    public final void q(String str) {
        if (str != null) {
            this.f40138b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public final void r(gn.c cVar) {
        if (cVar != null) {
            this.f40140d = cVar;
            return;
        }
        throw new NullPointerException("Null priority");
    }

    @Override // ep.c
    public final Object zza() {
        Object zza = ((ep.c) this.f40138b).zza();
        dp.c cVar = (dp.c) ((ep.c) this.f40139c).zza();
        Context context = ((dp.f) ((ep.c) this.f40140d)).f14447a.f15616b;
        if (context != null) {
            return new dp.e((dp.k) zza, cVar, context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i10) {
        this.f40137a = i10;
        this.f40140d = obj;
        this.f40138b = obj2;
        this.f40139c = obj3;
    }

    public c(ArrayList arrayList, sj.c cVar) {
        this.f40137a = 3;
        this.f40139c = arrayList;
        this.f40140d = cVar;
        this.f40138b = new ArrayList();
    }

    public c(int i10) {
        this.f40137a = i10;
        if (i10 != 8 && i10 != 9 && i10 != 13 && i10 != 14) {
            this.f40138b = new Object();
            this.f40140d = null;
        }
    }

    public c(h0 h0Var) {
        this.f40137a = 0;
        this.f40138b = new Object();
        this.f40140d = h0Var;
    }

    public c(SharedPreferences sharedPreferences, of.a aVar) {
        this.f40137a = 2;
        this.f40138b = sharedPreferences;
        this.f40139c = aVar;
        this.f40140d = null;
    }

    public c(bk.h hVar, InputStream inputStream, List list) {
        this.f40137a = 4;
        if (hVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f40139c = hVar;
        if (list != null) {
            this.f40140d = list;
            this.f40138b = new t9.c(inputStream, hVar);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public c(Context context, u uVar, ExecutorService executorService) {
        this.f40137a = 15;
        this.f40138b = executorService;
        this.f40139c = context;
        this.f40140d = uVar;
    }

    public c(ParcelFileDescriptor parcelFileDescriptor, List list, bk.h hVar) {
        this.f40137a = 5;
        if (hVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f40138b = hVar;
        if (list != null) {
            this.f40139c = list;
            this.f40140d = new l(parcelFileDescriptor);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }
}
