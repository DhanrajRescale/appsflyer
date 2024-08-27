package q;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import androidx.navigation.a0;
import androidx.navigation.c0;
import androidx.navigation.e0;
import androidx.navigation.f0;
import androidx.navigation.t;
import c2.e1;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import ek.h0;
import el.l;
import g7.t0;
import g7.u;
import g7.u4;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q3.b1;
import qu.h2;
import tu.j;
import tu.q1;
import tu.w0;
import tu.x0;
import vt.g0;
import vt.q;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31449a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31450b;

    /* renamed from: c, reason: collision with root package name */
    public Object f31451c;

    /* renamed from: d, reason: collision with root package name */
    public Object f31452d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f31453e;

    /* renamed from: f, reason: collision with root package name */
    public Object f31454f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(t navController) {
        this(navController.f2304a);
        this.f31449a = 1;
        Intrinsics.checkNotNullParameter(navController, "navController");
        this.f31452d = navController.h();
    }

    public static Class b(Class cls) {
        return cls == Byte.class ? Byte.TYPE : cls == Short.class ? Short.TYPE : cls == Integer.class ? Integer.TYPE : cls == Long.class ? Long.TYPE : cls == Float.class ? Float.TYPE : cls == Double.class ? Double.TYPE : cls == Boolean.class ? Boolean.TYPE : cls == Character.class ? Character.TYPE : cls;
    }

    public final Object a(View view, Object[] objArr) {
        if (((Class) this.f31453e).isAssignableFrom(view.getClass())) {
            try {
                return ((Method) this.f31454f).invoke(view, objArr);
            } catch (IllegalAccessException e10) {
                l.N("MixpanelABTest.Caller", "Method " + ((Method) this.f31454f).getName() + " appears not to be public", e10);
                return null;
            } catch (IllegalArgumentException e11) {
                l.N("MixpanelABTest.Caller", "Method " + ((Method) this.f31454f).getName() + " called with arguments of the wrong type", e11);
                return null;
            } catch (InvocationTargetException e12) {
                l.N("MixpanelABTest.Caller", "Method " + ((Method) this.f31454f).getName() + " threw an exception", e12);
                return null;
            }
        }
        return null;
    }

    public final b1 c() {
        if (((f0) this.f31452d) != null) {
            if (!((List) this.f31453e).isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                Iterator it = ((List) this.f31453e).iterator();
                c0 c0Var = null;
                while (true) {
                    int i10 = 0;
                    if (it.hasNext()) {
                        a0 a0Var = (a0) it.next();
                        int i11 = a0Var.f2150a;
                        c0 d10 = d(i11);
                        if (d10 != null) {
                            int[] g10 = d10.g(c0Var);
                            int length = g10.length;
                            while (i10 < length) {
                                arrayList.add(Integer.valueOf(g10[i10]));
                                arrayList2.add(a0Var.f2151b);
                                i10++;
                            }
                            c0Var = d10;
                        } else {
                            int i12 = c0.f2173j;
                            StringBuilder s7 = da.e.s("Navigation destination ", x2.c.o(i11, (Context) this.f31450b), " cannot be found in the navigation graph ");
                            s7.append((f0) this.f31452d);
                            throw new IllegalArgumentException(s7.toString());
                        }
                    } else {
                        ((Intent) this.f31451c).putExtra("android-support-nav:controller:deepLinkIds", g0.Q(arrayList));
                        ((Intent) this.f31451c).putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
                        b1 b1Var = new b1((Context) this.f31450b);
                        Intent intent = new Intent((Intent) this.f31451c);
                        ComponentName component = intent.getComponent();
                        if (component == null) {
                            component = intent.resolveActivity(b1Var.f31585b.getPackageManager());
                        }
                        if (component != null) {
                            b1Var.e(component);
                        }
                        b1Var.b(intent);
                        Intrinsics.checkNotNullExpressionValue(b1Var, "create(context)\n        …rentStack(Intent(intent))");
                        ArrayList arrayList3 = b1Var.f31584a;
                        int size = arrayList3.size();
                        while (i10 < size) {
                            Intent intent2 = (Intent) arrayList3.get(i10);
                            if (intent2 != null) {
                                intent2.putExtra("android-support-nav:controller:deepLinkIntent", (Intent) this.f31451c);
                            }
                            i10++;
                        }
                        return b1Var;
                    }
                }
            } else {
                throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
            }
        } else {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
    }

    public final c0 d(int i10) {
        q qVar = new q();
        f0 f0Var = (f0) this.f31452d;
        Intrinsics.c(f0Var);
        qVar.h(f0Var);
        while (!qVar.isEmpty()) {
            c0 c0Var = (c0) qVar.t();
            if (c0Var.f2181h == i10) {
                return c0Var;
            }
            if (c0Var instanceof f0) {
                e0 e0Var = new e0((f0) c0Var);
                while (e0Var.hasNext()) {
                    qVar.h((c0) e0Var.next());
                }
            }
        }
        return null;
    }

    public final void e(u4 u4Var, Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ReentrantLock reentrantLock = (ReentrantLock) this.f31453e;
        try {
            reentrantLock.lock();
            if (u4Var != null) {
                this.f31452d = u4Var;
            }
            block.invoke((t0) this.f31450b, (t0) this.f31451c);
            Unit unit = Unit.f23355a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void f() {
        Iterator it = ((List) this.f31453e).iterator();
        while (it.hasNext()) {
            int i10 = ((a0) it.next()).f2150a;
            if (d(i10) == null) {
                int i11 = c0.f2173j;
                StringBuilder s7 = da.e.s("Navigation destination ", x2.c.o(i10, (Context) this.f31450b), " cannot be found in the navigation graph ");
                s7.append((f0) this.f31452d);
                throw new IllegalArgumentException(s7.toString());
            }
        }
    }

    public final Task g(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task continueWithTask;
        String str2 = "*";
        if (zzac.zzd(str)) {
            str = "*";
        }
        Task task = (Task) ((Map) this.f31450b).get(str);
        if (bool.booleanValue() || task == null) {
            if (!zzac.zzd(str)) {
                str2 = str;
            }
            if (bool.booleanValue() || (continueWithTask = (Task) ((Map) this.f31450b).get(str2)) == null) {
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f31453e;
                continueWithTask = firebaseAuth.f11631e.zzl(firebaseAuth.f11637k, "RECAPTCHA_ENTERPRISE").continueWithTask(new wn.e(7, this, str2));
            }
            task = continueWithTask;
        }
        return task.continueWithTask(new h0(recaptchaAction));
    }

    public final String toString() {
        switch (this.f31449a) {
            case 10:
                return "[Caller " + ((String) this.f31450b) + "(" + ((Object[]) this.f31451c) + ")]";
            default:
                return super.toString();
        }
    }

    public h(pp.g gVar, FirebaseAuth firebaseAuth) {
        this.f31449a = 8;
        ll.e eVar = new ll.e(17);
        this.f31450b = new HashMap();
        this.f31452d = gVar;
        this.f31453e = firebaseAuth;
        this.f31454f = eVar;
    }

    public h(Class cls, String str, Object[] objArr, Class cls2) {
        Method method;
        this.f31449a = 10;
        this.f31450b = str;
        this.f31451c = objArr;
        this.f31452d = cls2;
        Class[] clsArr = new Class[objArr.length];
        int i10 = 0;
        while (true) {
            Object[] objArr2 = (Object[]) this.f31451c;
            if (i10 >= objArr2.length) {
                break;
            }
            clsArr[i10] = objArr2[i10].getClass();
            i10++;
        }
        Method[] methods = cls.getMethods();
        int length = methods.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                method = null;
                break;
            }
            method = methods[i11];
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (name.equals((String) this.f31450b) && parameterTypes.length == ((Object[]) this.f31451c).length && b((Class) this.f31452d).isAssignableFrom(b(method.getReturnType()))) {
                boolean z10 = true;
                for (int i12 = 0; i12 < parameterTypes.length && z10; i12++) {
                    z10 = b(parameterTypes[i12]).isAssignableFrom(b(clsArr[i12]));
                }
                if (z10) {
                    break;
                }
            }
            i11++;
        }
        this.f31454f = method;
        if (method != null) {
            this.f31453e = method.getDeclaringClass();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Method ");
        sb2.append(cls.getName());
        sb2.append(".");
        throw new NoSuchMethodException(nn.d.o(sb2, (String) this.f31450b, " doesn't exit"));
    }

    public h(bk.c cVar, q9.a aVar, q9.a aVar2, q9.a aVar3, q9.a aVar4) {
        this.f31449a = 4;
        this.f31450b = cVar;
        this.f31451c = aVar;
        this.f31452d = aVar2;
        this.f31453e = aVar3;
        this.f31454f = aVar4;
    }

    public h(tu.f src, qu.f0 scope) {
        this.f31449a = 2;
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f31450b = new g7.h0();
        w0 a10 = x0.a(1, Api.BaseClientBuilder.API_PRIORITY_OTHER, su.a.f34776a);
        this.f31451c = a10;
        this.f31452d = new q1(a10, new u(this, null));
        h2 H = yk.g.H(scope, null, qu.g0.f32206b, new g7.t(src, this, null), 1);
        H.I(new e1(this, 14));
        this.f31453e = H;
        this.f31454f = new j((Function2) new g7.q(this, null));
    }

    public h(Context context) {
        Intent launchIntentForPackage;
        this.f31449a = 1;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31450b = context;
        if (context instanceof Activity) {
            Context context2 = (Context) this.f31450b;
            launchIntentForPackage = new Intent(context2, context2.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(((Context) this.f31450b).getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f31451c = launchIntentForPackage;
        this.f31453e = new ArrayList();
    }

    public h(a.e eVar, c cVar, ComponentName componentName) {
        this.f31449a = 0;
        this.f31450b = new Object();
        this.f31451c = eVar;
        this.f31452d = cVar;
        this.f31453e = componentName;
        this.f31454f = null;
    }

    public h(hr.c cVar) {
        this.f31449a = 3;
        this.f31454f = cVar;
        this.f31450b = new t0();
        this.f31451c = new t0();
        this.f31453e = new ReentrantLock();
    }
}
