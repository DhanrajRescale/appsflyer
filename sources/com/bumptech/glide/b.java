package com.bumptech.glide;

import ak.r;
import android.R;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.g0;
import androidx.fragment.app.j0;
import androidx.work.u;
import aq.b0;
import ck.i;
import com.google.android.gms.common.api.Api;
import e.l;
import ek.d0;
import ek.f0;
import ek.h0;
import ek.q;
import hk.a0;
import hk.e0;
import hk.n;
import j8.m;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jk.j;
import mt.p;
import rk.k;

/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile b f10776i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f10777j;

    /* renamed from: a, reason: collision with root package name */
    public final bk.d f10778a;

    /* renamed from: b, reason: collision with root package name */
    public final ck.f f10779b;

    /* renamed from: c, reason: collision with root package name */
    public final d f10780c;

    /* renamed from: d, reason: collision with root package name */
    public final m f10781d;

    /* renamed from: e, reason: collision with root package name */
    public final bk.h f10782e;

    /* renamed from: f, reason: collision with root package name */
    public final lk.h f10783f;

    /* renamed from: g, reason: collision with root package name */
    public final ek.e f10784g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f10785h = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [z3.b, java.lang.Object, ek.x] */
    public b(Context context, r rVar, ck.f fVar, bk.d dVar, bk.h hVar, lk.h hVar2, ek.e eVar, l lVar, t.f fVar2, List list) {
        this.f10778a = dVar;
        this.f10782e = hVar;
        this.f10779b = fVar;
        this.f10783f = hVar2;
        this.f10784g = eVar;
        Resources resources = context.getResources();
        m mVar = new m();
        this.f10781d = mVar;
        Object obj = new Object();
        q9.b bVar = (q9.b) mVar.f21099g;
        synchronized (bVar) {
            bVar.f31867a.add(obj);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            Object obj2 = new Object();
            q9.b bVar2 = (q9.b) mVar.f21099g;
            synchronized (bVar2) {
                bVar2.f31867a.add(obj2);
            }
        }
        List i11 = mVar.i();
        jk.a aVar = new jk.a(context, i11, dVar, hVar);
        e0 e0Var = new e0(dVar, new u(5));
        n nVar = new n(mVar.i(), resources.getDisplayMetrics(), dVar, hVar);
        hk.e eVar2 = new hk.e(nVar, 0);
        hk.a aVar2 = new hk.a(2, nVar, hVar);
        ik.c cVar = new ik.c(context);
        hr.c cVar2 = new hr.c(resources, 28);
        d0 d0Var = new d0(resources, 1);
        int i12 = 0;
        d7.g gVar = new d7.g(resources, i12);
        d0 d0Var2 = new d0(resources, i12);
        hk.b bVar3 = new hk.b(hVar);
        eb.f fVar3 = new eb.f(5);
        u uVar = new u(6);
        ContentResolver contentResolver = context.getContentResolver();
        mVar.d(ByteBuffer.class, new u(0));
        mVar.d(InputStream.class, new ek.u(hVar, 1));
        mVar.f(eVar2, ByteBuffer.class, Bitmap.class, "Bitmap");
        mVar.f(aVar2, InputStream.class, Bitmap.class, "Bitmap");
        mVar.f(new hk.e(nVar, 1), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        mVar.f(e0Var, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        mVar.f(new e0(dVar, new u()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        f0 f0Var = f0.f15587a;
        mVar.c(Bitmap.class, Bitmap.class, f0Var);
        mVar.f(new a0(0), Bitmap.class, Bitmap.class, "Bitmap");
        mVar.e(Bitmap.class, bVar3);
        mVar.f(new hk.a(resources, eVar2), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        mVar.f(new hk.a(resources, aVar2), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        mVar.f(new hk.a(resources, e0Var), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        mVar.e(BitmapDrawable.class, new da.d(dVar, bVar3, 14));
        mVar.f(new j(i11, aVar, hVar), InputStream.class, jk.c.class, "Gif");
        mVar.f(aVar, ByteBuffer.class, jk.c.class, "Gif");
        mVar.e(jk.c.class, new ek.e(6));
        mVar.c(wj.a.class, wj.a.class, f0Var);
        mVar.f(new ik.c(dVar), wj.a.class, Bitmap.class, "Bitmap");
        mVar.f(cVar, Uri.class, Drawable.class, "legacy_append");
        mVar.f(new hk.a(1, cVar, dVar), Uri.class, Bitmap.class, "legacy_append");
        mVar.t(new yj.h(2));
        mVar.c(File.class, ByteBuffer.class, new ek.h(0));
        mVar.c(File.class, InputStream.class, new b0(1));
        mVar.f(new a0(2), File.class, File.class, "legacy_append");
        mVar.c(File.class, ParcelFileDescriptor.class, new b0(0));
        mVar.c(File.class, File.class, f0Var);
        mVar.t(new yj.m(hVar));
        mVar.t(new yj.h(1));
        Class cls = Integer.TYPE;
        mVar.c(cls, InputStream.class, cVar2);
        mVar.c(cls, ParcelFileDescriptor.class, gVar);
        mVar.c(Integer.class, InputStream.class, cVar2);
        mVar.c(Integer.class, ParcelFileDescriptor.class, gVar);
        mVar.c(Integer.class, Uri.class, d0Var);
        mVar.c(cls, AssetFileDescriptor.class, d0Var2);
        mVar.c(Integer.class, AssetFileDescriptor.class, d0Var2);
        mVar.c(cls, Uri.class, d0Var);
        mVar.c(String.class, InputStream.class, new hr.c(27));
        mVar.c(Uri.class, InputStream.class, new hr.c(27));
        int i13 = 2;
        mVar.c(String.class, InputStream.class, new ek.h(i13));
        mVar.c(String.class, ParcelFileDescriptor.class, new u(i13));
        mVar.c(String.class, AssetFileDescriptor.class, new ek.e(i13));
        mVar.c(Uri.class, InputStream.class, new u(3));
        int i14 = 28;
        mVar.c(Uri.class, InputStream.class, new t9.c(context.getAssets(), i14));
        mVar.c(Uri.class, ParcelFileDescriptor.class, new l(context.getAssets(), i14));
        mVar.c(Uri.class, InputStream.class, new q(context, 1));
        mVar.c(Uri.class, InputStream.class, new b8.f(context));
        if (i10 >= 29) {
            mVar.c(Uri.class, InputStream.class, new fk.c(context, 1));
            mVar.c(Uri.class, ParcelFileDescriptor.class, new fk.c(context, 0));
        }
        mVar.c(Uri.class, InputStream.class, new ek.u(contentResolver, 2));
        mVar.c(Uri.class, ParcelFileDescriptor.class, new h0(contentResolver, 0));
        ?? obj3 = new Object();
        obj3.f41983a = contentResolver;
        mVar.c(Uri.class, AssetFileDescriptor.class, obj3);
        int i15 = 3;
        mVar.c(Uri.class, InputStream.class, new ek.e(i15));
        mVar.c(URL.class, InputStream.class, new ek.h(i15));
        mVar.c(Uri.class, File.class, new q(context, 0));
        mVar.c(ek.l.class, InputStream.class, new hr.c(29));
        mVar.c(byte[].class, ByteBuffer.class, new ni.j(29));
        mVar.c(byte[].class, InputStream.class, new ek.e(0));
        mVar.c(Uri.class, Uri.class, f0Var);
        mVar.c(Drawable.class, Drawable.class, f0Var);
        int i16 = 1;
        mVar.f(new a0(i16), Drawable.class, Drawable.class, "legacy_append");
        mVar.s(Bitmap.class, BitmapDrawable.class, new d7.g(resources, i16));
        mVar.s(Bitmap.class, byte[].class, fVar3);
        mVar.s(Drawable.class, byte[].class, new x9.c(6, dVar, fVar3, uVar));
        mVar.s(jk.c.class, byte[].class, uVar);
        e0 e0Var2 = new e0(dVar, new ek.h(4));
        mVar.f(e0Var2, ByteBuffer.class, Bitmap.class, "legacy_append");
        mVar.f(new hk.a(resources, e0Var2), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        this.f10780c = new d(context, hVar, mVar, new ek.e(8), lVar, fVar2, list, rVar);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [ck.d, ck.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [bk.d, java.lang.Object] */
    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        int i10;
        if (!f10777j) {
            f10777j = true;
            c cVar = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            b8.f fVar = new b8.f(applicationContext);
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = fVar.f4092a.getPackageManager().getApplicationInfo(fVar.f4092a.getPackageName(), 128);
                if (applicationInfo.metaData == null) {
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Got null app info metadata");
                    }
                } else {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            b8.f.c(str);
                            throw null;
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.a0().isEmpty()) {
                    generatedAppGlideModule.a0();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        a3.a.u(it.next());
                        throw null;
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        a3.a.u(it2.next());
                        throw null;
                    }
                }
                cVar.f10797l = null;
                Iterator it3 = arrayList.iterator();
                if (!it3.hasNext()) {
                    dk.c cVar2 = cVar.f10791f;
                    p pVar = dk.b.N;
                    if (cVar2 == null) {
                        if (dk.c.f14407c == 0) {
                            dk.c.f14407c = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        int i11 = dk.c.f14407c;
                        if (!TextUtils.isEmpty("source")) {
                            cVar.f10791f = new dk.c(new ThreadPoolExecutor(i11, i11, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new dk.a("source", pVar, false)));
                        } else {
                            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
                        }
                    }
                    if (cVar.f10792g == null) {
                        int i12 = dk.c.f14407c;
                        if (!TextUtils.isEmpty("disk-cache")) {
                            cVar.f10792g = new dk.c(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new dk.a("disk-cache", pVar, true)));
                        } else {
                            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                        }
                    }
                    if (cVar.f10798m == null) {
                        if (dk.c.f14407c == 0) {
                            dk.c.f14407c = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        if (dk.c.f14407c >= 4) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        if (!TextUtils.isEmpty("animation")) {
                            cVar.f10798m = new dk.c(new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new dk.a("animation", pVar, true)));
                        } else {
                            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                        }
                    }
                    if (cVar.f10794i == null) {
                        cVar.f10794i = new i(new ck.h(applicationContext));
                    }
                    if (cVar.f10795j == null) {
                        cVar.f10795j = new ek.e(7);
                    }
                    if (cVar.f10788c == null) {
                        int i13 = cVar.f10794i.f8201a;
                        if (i13 > 0) {
                            cVar.f10788c = new bk.i(i13);
                        } else {
                            cVar.f10788c = new Object();
                        }
                    }
                    if (cVar.f10789d == null) {
                        cVar.f10789d = new bk.h(cVar.f10794i.f8203c);
                    }
                    if (cVar.f10790e == null) {
                        cVar.f10790e = new ck.f(cVar.f10794i.f8202b);
                    }
                    if (cVar.f10793h == null) {
                        cVar.f10793h = new ck.d(new da.d(applicationContext, "image_manager_disk_cache", 11));
                    }
                    if (cVar.f10787b == null) {
                        cVar.f10787b = new r(cVar.f10790e, cVar.f10793h, cVar.f10792g, cVar.f10791f, new dk.c(new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, dk.c.f14406b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new dk.a("source-unlimited", pVar, false))), cVar.f10798m);
                    }
                    List list = cVar.f10799n;
                    if (list == null) {
                        cVar.f10799n = Collections.emptyList();
                    } else {
                        cVar.f10799n = Collections.unmodifiableList(list);
                    }
                    b bVar = new b(applicationContext, cVar.f10787b, cVar.f10790e, cVar.f10788c, cVar.f10789d, new lk.h(cVar.f10797l), cVar.f10795j, cVar.f10796k, cVar.f10786a, cVar.f10799n);
                    Iterator it4 = arrayList.iterator();
                    if (!it4.hasNext()) {
                        applicationContext.registerComponentCallbacks(bVar);
                        f10776i = bVar;
                        f10777j = false;
                        return;
                    }
                    a3.a.u(it4.next());
                    throw null;
                }
                a3.a.u(it3.next());
                throw null;
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e10);
            }
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f10776i == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                try {
                    if (f10776i == null) {
                        a(context, generatedAppGlideModule);
                    }
                } finally {
                }
            }
        }
        return f10776i;
    }

    public static lk.h c(Context context) {
        if (context != null) {
            return b(context).f10783f;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public static h e(Context context) {
        return c(context).d(context);
    }

    public static h f(View view) {
        lk.h c10 = c(view.getContext());
        c10.getClass();
        if (k.g()) {
            return c10.d(view.getContext().getApplicationContext());
        }
        if (view.getContext() != null) {
            Activity a10 = lk.h.a(view.getContext());
            if (a10 == null) {
                return c10.d(view.getContext().getApplicationContext());
            }
            g0 g0Var = null;
            if (a10 instanceof j0) {
                j0 j0Var = (j0) a10;
                t.f fVar = c10.f24890f;
                fVar.clear();
                lk.h.c(j0Var.getSupportFragmentManager().f1646c.f(), fVar);
                View findViewById = j0Var.findViewById(R.id.content);
                while (!view.equals(findViewById) && (g0Var = (g0) fVar.get(view)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                fVar.clear();
                if (g0Var != null) {
                    return c10.e(g0Var);
                }
                return c10.f(j0Var);
            }
            t.f fVar2 = c10.f24891g;
            fVar2.clear();
            c10.b(a10.getFragmentManager(), fVar2);
            View findViewById2 = a10.findViewById(R.id.content);
            Fragment fragment = null;
            while (!view.equals(findViewById2) && (fragment = (Fragment) fVar2.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            fVar2.clear();
            ek.h hVar = c10.f24889e;
            if (fragment == null) {
                if (k.g()) {
                    return c10.d(a10.getApplicationContext());
                }
                if (!a10.isDestroyed()) {
                    lk.g g10 = c10.g(a10.getFragmentManager(), null, lk.h.i(a10));
                    h hVar2 = g10.f24881d;
                    if (hVar2 == null) {
                        b b10 = b(a10);
                        hVar.getClass();
                        h hVar3 = new h(b10, g10.f24878a, g10.f24879b, a10);
                        g10.f24881d = hVar3;
                        hVar2 = hVar3;
                    }
                    return hVar2;
                }
                throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
            }
            if (fragment.getActivity() != null) {
                if (!k.g()) {
                    FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                    Activity activity = fragment.getActivity();
                    lk.g g11 = c10.g(childFragmentManager, fragment, fragment.isVisible());
                    h hVar4 = g11.f24881d;
                    if (hVar4 == null) {
                        b b11 = b(activity);
                        hVar.getClass();
                        h hVar5 = new h(b11, g11.f24878a, g11.f24879b, activity);
                        g11.f24881d = hVar5;
                        hVar4 = hVar5;
                    }
                    return hVar4;
                }
                return c10.d(fragment.getActivity().getApplicationContext());
            }
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        throw new NullPointerException("Unable to obtain a request manager for a view without a Context");
    }

    public static h g(g0 g0Var) {
        return c(g0Var.getContext()).e(g0Var);
    }

    public final void d(h hVar) {
        synchronized (this.f10785h) {
            try {
                if (this.f10785h.contains(hVar)) {
                    this.f10785h.remove(hVar);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        char[] cArr = k.f33950a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f10779b.e(0L);
            this.f10778a.m();
            bk.h hVar = this.f10782e;
            synchronized (hVar) {
                hVar.b(0);
            }
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        long j10;
        char[] cArr = k.f33950a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Iterator it = this.f10785h.iterator();
            while (it.hasNext()) {
                ((h) it.next()).getClass();
            }
            ck.f fVar = this.f10779b;
            fVar.getClass();
            if (i10 >= 40) {
                fVar.e(0L);
            } else if (i10 >= 20 || i10 == 15) {
                synchronized (fVar) {
                    j10 = fVar.f33943b;
                }
                fVar.e(j10 / 2);
            }
            this.f10778a.a(i10);
            bk.h hVar = this.f10782e;
            synchronized (hVar) {
                if (i10 >= 40) {
                    synchronized (hVar) {
                        hVar.b(0);
                    }
                } else if (i10 >= 20 || i10 == 15) {
                    hVar.b(hVar.f7050e / 2);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }
}
