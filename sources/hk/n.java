package hk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static final xj.j f18547f = xj.j.a(xj.b.f40294c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final xj.j f18548g = xj.j.a(xj.l.f40306a, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    public static final xj.j f18549h;

    /* renamed from: i, reason: collision with root package name */
    public static final xj.j f18550i;

    /* renamed from: j, reason: collision with root package name */
    public static final ek.e f18551j;

    /* renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f18552k;

    /* renamed from: a, reason: collision with root package name */
    public final bk.d f18553a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f18554b;

    /* renamed from: c, reason: collision with root package name */
    public final bk.h f18555c;

    /* renamed from: d, reason: collision with root package name */
    public final List f18556d;

    /* renamed from: e, reason: collision with root package name */
    public final t f18557e = t.a();

    static {
        k kVar = l.f18540a;
        Boolean bool = Boolean.FALSE;
        f18549h = xj.j.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f18550i = xj.j.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f18551j = new ek.e(4);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = rk.k.f33950a;
        f18552k = new ArrayDeque(0);
    }

    public n(List list, DisplayMetrics displayMetrics, bk.d dVar, bk.h hVar) {
        this.f18556d = list;
        if (displayMetrics != null) {
            this.f18554b = displayMetrics;
            if (dVar != null) {
                this.f18553a = dVar;
                if (hVar != null) {
                    this.f18555c = hVar;
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(x9.c r5, android.graphics.BitmapFactory.Options r6, hk.m r7, bk.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L22
            r7.i()
            int r1 = r5.f40137a
            switch(r1) {
                case 4: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r5.f40138b
            t9.c r1 = (t9.c) r1
            java.lang.Object r1 = r1.f35633b
            hk.v r1 = (hk.v) r1
            monitor-enter(r1)
            byte[] r2 = r1.f18569a     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.f18571c = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L22:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = hk.y.f18580d
            r4.lock()
            android.graphics.Bitmap r5 = r5.h(r6)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L47
            r4.unlock()
            return r5
        L35:
            r4 = move-exception
            java.io.IOException r1 = e(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L47
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L49
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r5 = move-exception
            goto L5f
        L49:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L5e
            r8.b(r0)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L5d
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L5d
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L5d
            java.util.concurrent.locks.Lock r6 = hk.y.f18580d
            r6.unlock()
            return r5
        L5d:
            throw r1     // Catch: java.lang.Throwable -> L47
        L5e:
            throw r1     // Catch: java.lang.Throwable -> L47
        L5f:
            java.util.concurrent.locks.Lock r6 = hk.y.f18580d
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.n.c(x9.c, android.graphics.BitmapFactory$Options, hk.m, bk.d):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        StringBuilder q10 = da.e.q("Exception decoding bitmap, outWidth: ", i10, ", outHeight: ", i11, ", outMimeType: ");
        q10.append(str);
        q10.append(", inBitmap: ");
        q10.append(d(options.inBitmap));
        return new IOException(q10.toString(), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final c a(x9.c cVar, int i10, int i11, xj.k kVar, m mVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z10;
        byte[] bArr = (byte[]) this.f18555c.c(65536, byte[].class);
        synchronized (n.class) {
            arrayDeque = f18552k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        xj.b bVar = (xj.b) kVar.c(f18547f);
        xj.l lVar = (xj.l) kVar.c(f18548g);
        l lVar2 = (l) kVar.c(l.f18545f);
        boolean booleanValue = ((Boolean) kVar.c(f18549h)).booleanValue();
        xj.j jVar = f18550i;
        if (kVar.c(jVar) != null && ((Boolean) kVar.c(jVar)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            c e10 = c.e(b(cVar, options2, lVar2, bVar, lVar, z10, i10, i11, booleanValue, mVar), this.f18553a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f18555c.g(bArr);
            return e10;
        } catch (Throwable th2) {
            f(options2);
            ArrayDeque arrayDeque2 = f18552k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f18555c.g(bArr);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x037e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(x9.c r39, android.graphics.BitmapFactory.Options r40, hk.l r41, xj.b r42, xj.l r43, boolean r44, int r45, int r46, boolean r47, hk.m r48) {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.n.b(x9.c, android.graphics.BitmapFactory$Options, hk.l, xj.b, xj.l, boolean, int, int, boolean, hk.m):android.graphics.Bitmap");
    }
}
