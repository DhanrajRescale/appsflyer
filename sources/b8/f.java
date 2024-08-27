package b8;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.google.firebase.messaging.t;
import ek.c0;
import ek.w;
import ek.x;
import java.lang.reflect.InvocationTargetException;
import javax.inject.Provider;
import jn.s;
import ll.o;

/* loaded from: classes.dex */
public final class f implements p7.c, x {

    /* renamed from: a, reason: collision with root package name */
    public Context f4092a;

    public /* synthetic */ f(Context context) {
        this.f4092a = context;
    }

    public static void c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(jr.h.q("Expected instanceof GlideModule, but found: ", cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
            } catch (IllegalAccessException e10) {
                d(cls, e10);
                throw null;
            } catch (InstantiationException e11) {
                d(cls, e11);
                throw null;
            } catch (NoSuchMethodException e12) {
                d(cls, e12);
                throw null;
            } catch (InvocationTargetException e13) {
                d(cls, e13);
                throw null;
            }
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    public static void d(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [jn.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [javax.inject.Provider, b8.m, java.lang.Object] */
    public jn.j a() {
        Context context = this.f4092a;
        if (context != null) {
            ?? obj = new Object();
            obj.f21502a = ln.a.a(jn.m.f21511a);
            e4.k kVar = new e4.k(context);
            obj.f21503b = kVar;
            ll.a aVar = rn.b.f33962a;
            ll.e eVar = rn.b.f33963b;
            int i10 = 0;
            obj.f21504c = ln.a.a(new da.d(kVar, new kn.e(kVar, aVar, eVar, i10), 27));
            e4.k kVar2 = obj.f21503b;
            obj.f21505d = new kn.e(kVar2, pn.e.f31234a, pn.e.f31235b, 1);
            Provider a10 = ln.a.a(new o(kVar2, 3));
            obj.f21506e = a10;
            Provider a11 = ln.a.a(new s(aVar, eVar, pn.e.f31236c, obj.f21505d, a10, 2));
            obj.f21507f = a11;
            nn.c cVar = new nn.c(aVar, i10);
            e4.k kVar3 = obj.f21503b;
            t tVar = new t(kVar3, a11, cVar, eVar, 9);
            Provider provider = obj.f21502a;
            Provider provider2 = obj.f21504c;
            s sVar = new s(provider, provider2, tVar, a11, a11, 1);
            ?? obj2 = new Object();
            obj2.f4117a = kVar3;
            obj2.f4118b = provider2;
            obj2.f4119c = a11;
            obj2.f4120d = tVar;
            obj2.f4121e = provider;
            obj2.f4122f = a11;
            obj2.f4123g = aVar;
            obj2.f4124h = eVar;
            obj2.f4125i = a11;
            obj.f21508g = ln.a.a(new s(aVar, eVar, sVar, obj2, new h8.h(provider, a11, tVar, a11, 10), 0));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public int b() {
        Configuration configuration = this.f4092a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i10 <= 600) {
            if (i10 <= 960 || i11 <= 720) {
                if (i10 <= 720 || i11 <= 960) {
                    if (i10 < 500) {
                        if (i10 <= 640 || i11 <= 480) {
                            if (i10 <= 480 || i11 <= 640) {
                                if (i10 >= 360) {
                                    return 3;
                                }
                                return 2;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 5;
            }
            return 5;
        }
        return 5;
    }

    @Override // ek.x
    public w f(c0 c0Var) {
        return new ek.s(this.f4092a, 2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [p7.b, java.lang.Object] */
    @Override // p7.c
    public p7.d g(p7.b bVar) {
        String str = bVar.f30721b;
        m.c0 c0Var = bVar.f30722c;
        if (c0Var != null) {
            Context context = this.f4092a;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    ?? obj = new Object();
                    obj.f30720a = context;
                    obj.f30721b = str;
                    obj.f30722c = c0Var;
                    obj.f30723d = true;
                    return new q7.e(obj.f30720a, obj.f30721b, obj.f30722c, obj.f30723d);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}
