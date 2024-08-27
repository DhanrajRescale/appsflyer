package el;

import android.content.Context;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: u */
    public static g f15654u;

    /* renamed from: a */
    public final Context f15658a;

    /* renamed from: b */
    public final Object f15659b;

    /* renamed from: c */
    public final Class f15660c;

    /* renamed from: d */
    public final Class f15661d;

    /* renamed from: e */
    public final Class f15662e;

    /* renamed from: f */
    public final Class f15663f;

    /* renamed from: g */
    public final Class f15664g;

    /* renamed from: h */
    public final Class f15665h;

    /* renamed from: i */
    public final Class f15666i;

    /* renamed from: j */
    public final Method f15667j;

    /* renamed from: k */
    public final Method f15668k;

    /* renamed from: l */
    public final Method f15669l;

    /* renamed from: m */
    public final Method f15670m;

    /* renamed from: n */
    public final Method f15671n;

    /* renamed from: o */
    public final Method f15672o;

    /* renamed from: p */
    public final Method f15673p;

    /* renamed from: q */
    public final k f15674q;

    /* renamed from: r */
    public final CopyOnWriteArraySet f15675r = new CopyOnWriteArraySet();

    /* renamed from: s */
    public static final ek.h f15652s = new ek.h(26, 0);

    /* renamed from: t */
    public static final AtomicBoolean f15653t = new AtomicBoolean(false);

    /* renamed from: v */
    public static final AtomicBoolean f15655v = new AtomicBoolean(false);

    /* renamed from: w */
    public static final ConcurrentHashMap f15656w = new ConcurrentHashMap();

    /* renamed from: x */
    public static final ConcurrentHashMap f15657x = new ConcurrentHashMap();

    public g(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, k kVar) {
        this.f15658a = context;
        this.f15659b = obj;
        this.f15660c = cls;
        this.f15661d = cls2;
        this.f15662e = cls3;
        this.f15663f = cls4;
        this.f15664g = cls5;
        this.f15665h = cls6;
        this.f15666i = cls7;
        this.f15667j = method;
        this.f15668k = method2;
        this.f15669l = method3;
        this.f15670m = method4;
        this.f15671n = method5;
        this.f15672o = method6;
        this.f15673p = method7;
        this.f15674q = kVar;
    }

    public static final /* synthetic */ g a() {
        if (sl.a.b(g.class)) {
            return null;
        }
        try {
            return f15654u;
        } catch (Throwable th2) {
            sl.a.a(g.class, th2);
            return null;
        }
    }

    public final void b(com.appsflyer.internal.l querySkuRunnable) {
        List list;
        String str;
        if (sl.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter("inapp", "skuType");
            Intrinsics.checkNotNullParameter(querySkuRunnable, "querySkuRunnable");
            Object n0 = l.n0(this.f15661d, l.n0(this.f15660c, this.f15659b, this.f15667j, "inapp"), this.f15668k, new Object[0]);
            if (n0 instanceof List) {
                list = (List) n0;
            } else {
                list = null;
            }
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object n02 = l.n0(this.f15662e, it.next(), this.f15669l, new Object[0]);
                    if (n02 instanceof String) {
                        str = (String) n02;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String skuID = jSONObject.getString("productId");
                            arrayList.add(skuID);
                            ConcurrentHashMap concurrentHashMap = f15656w;
                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                            concurrentHashMap.put(skuID, jSONObject);
                        }
                    }
                }
                d(arrayList, querySkuRunnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final void c(com.appsflyer.internal.l queryPurchaseHistoryRunnable) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter("inapp", "skuType");
            Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "queryPurchaseHistoryRunnable");
            yk.h hVar = new yk.h(7, this, queryPurchaseHistoryRunnable);
            Class cls = this.f15666i;
            if (!sl.a.b(this)) {
                try {
                    l.n0(this.f15660c, this.f15659b, this.f15673p, "inapp", Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new f(this, hVar, 0)));
                } catch (Throwable th2) {
                    sl.a.a(this, th2);
                }
            }
        } catch (Throwable th3) {
            sl.a.a(this, th3);
        }
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        Class cls = this.f15665h;
        if (sl.a.b(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new f(this, runnable, 1));
            l.n0(this.f15660c, this.f15659b, this.f15672o, this.f15674q.a(arrayList), newProxyInstance);
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final void e() {
        Method i02;
        Class cls = this.f15660c;
        if (sl.a.b(this)) {
            return;
        }
        try {
            Class c02 = l.c0("com.android.billingclient.api.BillingClientStateListener");
            if (c02 == null || (i02 = l.i0(cls, "startConnection", c02)) == null) {
                return;
            }
            l.n0(cls, this.f15659b, i02, Proxy.newProxyInstance(c02.getClassLoader(), new Class[]{c02}, new e(0)));
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
