package u4;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;
import h.m0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f36741a = b.f36738c;

    public static b a(g0 g0Var) {
        while (g0Var != null) {
            if (g0Var.isAdded()) {
                d1 parentFragmentManager = g0Var.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                parentFragmentManager.getClass();
            }
            g0Var = g0Var.getParentFragment();
        }
        return f36741a;
    }

    public static void b(b bVar, Violation violation) {
        g0 g0Var = violation.f1830a;
        String name = g0Var.getClass().getName();
        a aVar = a.f36728a;
        Set set = bVar.f36739a;
        if (set.contains(aVar)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), violation);
        }
        if (set.contains(a.f36729b)) {
            m0 m0Var = new m0(6, name, violation);
            if (g0Var.isAdded()) {
                Handler handler = g0Var.getParentFragmentManager().f1665v.f1776c;
                Intrinsics.checkNotNullExpressionValue(handler, "fragment.parentFragmentManager.host.handler");
                if (Intrinsics.a(handler.getLooper(), Looper.myLooper())) {
                    m0Var.run();
                    return;
                } else {
                    handler.post(m0Var);
                    return;
                }
            }
            m0Var.run();
        }
    }

    public static void c(Violation violation) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.f1830a.getClass().getName()), violation);
        }
    }

    public static final void d(g0 fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        Violation violation = new Violation(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        c(violation);
        b a10 = a(fragment);
        if (a10.f36739a.contains(a.f36730c) && e(a10, fragment.getClass(), FragmentReuseViolation.class)) {
            b(a10, violation);
        }
    }

    public static boolean e(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.f36740b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!Intrinsics.a(cls2.getSuperclass(), Violation.class) && vt.g0.q(set, cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
