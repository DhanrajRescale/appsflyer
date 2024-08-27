package bk;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import mt.p;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config f7052j = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final j f7053a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f7054b;

    /* renamed from: c, reason: collision with root package name */
    public final p f7055c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7056d;

    /* renamed from: e, reason: collision with root package name */
    public long f7057e;

    /* renamed from: f, reason: collision with root package name */
    public int f7058f;

    /* renamed from: g, reason: collision with root package name */
    public int f7059g;

    /* renamed from: h, reason: collision with root package name */
    public int f7060h;

    /* renamed from: i, reason: collision with root package name */
    public int f7061i;

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, mt.p] */
    public i(long j10) {
        Bitmap.Config config;
        n nVar = new n();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f7056d = j10;
        this.f7053a = nVar;
        this.f7054b = unmodifiableSet;
        this.f7055c = new Object();
    }

    @Override // bk.d
    public final void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 < 40 && i10 < 20) {
            if (i10 >= 20 || i10 == 15) {
                g(this.f7056d / 2);
                return;
            }
            return;
        }
        m();
    }

    @Override // bk.d
    public final synchronized void b(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f7053a.k(bitmap) <= this.f7056d && this.f7054b.contains(bitmap.getConfig())) {
                        int k10 = this.f7053a.k(bitmap);
                        this.f7053a.b(bitmap);
                        this.f7055c.getClass();
                        this.f7060h++;
                        this.f7057e += k10;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f7053a.m(bitmap));
                        }
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            c();
                        }
                        g(this.f7056d);
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f7053a.m(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f7054b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        Log.v("LruBitmapPool", "Hits=" + this.f7058f + ", misses=" + this.f7059g + ", puts=" + this.f7060h + ", evictions=" + this.f7061i + ", currentSize=" + this.f7057e + ", maxSize=" + this.f7056d + "\nStrategy=" + this.f7053a);
    }

    @Override // bk.d
    public final Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap f10 = f(i10, i11, config);
        if (f10 != null) {
            f10.eraseColor(0);
            return f10;
        }
        if (config == null) {
            config = f7052j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // bk.d
    public final Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap f10 = f(i10, i11, config);
        if (f10 == null) {
            if (config == null) {
                config = f7052j;
            }
            return Bitmap.createBitmap(i10, i11, config);
        }
        return f10;
    }

    public final synchronized Bitmap f(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap d10;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            j jVar = this.f7053a;
            if (config != null) {
                config3 = config;
            } else {
                config3 = f7052j;
            }
            d10 = jVar.d(i10, i11, config3);
            if (d10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f7053a.g(i10, i11, config));
                }
                this.f7059g++;
            } else {
                this.f7058f++;
                this.f7057e -= this.f7053a.k(d10);
                this.f7055c.getClass();
                d10.setHasAlpha(true);
                d10.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f7053a.g(i10, i11, config));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return d10;
    }

    public final synchronized void g(long j10) {
        while (this.f7057e > j10) {
            try {
                Bitmap a10 = this.f7053a.a();
                if (a10 == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        c();
                    }
                    this.f7057e = 0L;
                    return;
                }
                this.f7055c.getClass();
                this.f7057e -= this.f7053a.k(a10);
                this.f7061i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f7053a.m(a10));
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    c();
                }
                a10.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bk.d
    public final void m() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        g(0L);
    }
}
