package d4;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.assetgro.stockgro.prod.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f13788a;

    /* renamed from: b, reason: collision with root package name */
    public static Field f13789b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f13790c;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f13791d;

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f13792e;

    /* renamed from: f, reason: collision with root package name */
    public static final s0 f13793f;

    /* JADX WARN: Type inference failed for: r0v5, types: [d4.q0, java.lang.Object] */
    static {
        new AtomicInteger(1);
        f13788a = null;
        f13790c = false;
        f13791d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f13792e = new Object();
        f13793f = new s0();
    }

    public static b2 a(View view) {
        if (f13788a == null) {
            f13788a = new WeakHashMap();
        }
        b2 b2Var = (b2) f13788a.get(view);
        if (b2Var == null) {
            b2 b2Var2 = new b2(view);
            f13788a.put(view, b2Var2);
            return b2Var2;
        }
        return b2Var;
    }

    public static d3 b(View view, d3 d3Var) {
        WindowInsets f10 = d3Var.f();
        if (f10 != null) {
            WindowInsets a10 = z0.a(view, f10);
            if (!a10.equals(f10)) {
                return d3.g(view, a10);
            }
        }
        return d3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, d4.m1] */
    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = m1.f13780d;
        m1 m1Var = (m1) view.getTag(R.id.tag_unhandled_key_event_manager);
        m1 m1Var2 = m1Var;
        if (m1Var == null) {
            ?? obj = new Object();
            obj.f13781a = null;
            obj.f13782b = null;
            obj.f13783c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            m1Var2 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = m1Var2.f13781a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = m1.f13780d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (m1Var2.f13781a == null) {
                            m1Var2.f13781a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = m1.f13780d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                m1Var2.f13781a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    m1Var2.f13781a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a10 = m1Var2.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (m1Var2.f13782b == null) {
                    m1Var2.f13782b = new SparseArray();
                }
                m1Var2.f13782b.put(keyCode, new WeakReference(a10));
            }
        }
        if (a10 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h1.a(view);
        }
        if (f13790c) {
            return null;
        }
        if (f13789b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f13789b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f13790c = true;
                return null;
            }
        }
        try {
            Object obj = f13789b.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f13790c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        return (CharSequence) new r0(R.id.tag_accessibility_pane_title, 8, 28, 1).e(view);
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] g(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return j1.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i10) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (e(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 32;
        if (y0.a(view) == 0 && !z10) {
            if (i10 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                y0.g(obtain, i10);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(e(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    y0.e(view.getParent(), view, view, i10);
                    return;
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                    return;
                }
            }
            return;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z10) {
            i11 = 2048;
        }
        obtain2.setEventType(i11);
        y0.g(obtain2, i10);
        if (z10) {
            obtain2.getText().add(e(view));
            if (v0.c(view) == 0) {
                v0.s(view, 1);
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static d3 i(View view, d3 d3Var) {
        WindowInsets f10 = d3Var.f();
        if (f10 != null) {
            WindowInsets b10 = z0.b(view, f10);
            if (!b10.equals(f10)) {
                return d3.g(view, b10);
            }
        }
        return d3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h j(View view, h hVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + hVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return j1.b(view, hVar);
        }
        e0 e0Var = (e0) view.getTag(R.id.tag_on_receive_content_listener);
        f0 f0Var = f13792e;
        if (e0Var != null) {
            h a10 = ((h4.v) e0Var).a(view, hVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof f0) {
                f0Var = (f0) view;
            }
            return f0Var.a(a10);
        }
        if (view instanceof f0) {
            f0Var = (f0) view;
        }
        return f0Var.a(hVar);
    }

    public static void k(View view, int i10) {
        ArrayList f10 = f(view);
        for (int i11 = 0; i11 < f10.size(); i11++) {
            if (((e4.f) f10.get(i11)).a() == i10) {
                f10.remove(i11);
                return;
            }
        }
    }

    public static void l(View view, e4.f fVar, e4.y yVar) {
        c cVar;
        if (yVar == null) {
            k(view, fVar.a());
            h(view, 0);
            return;
        }
        e4.f fVar2 = new e4.f(null, fVar.f14990b, null, yVar, fVar.f14991c);
        View.AccessibilityDelegate d10 = d(view);
        if (d10 == null) {
            cVar = null;
        } else if (d10 instanceof a) {
            cVar = ((a) d10).f13716a;
        } else {
            cVar = new c(d10);
        }
        if (cVar == null) {
            cVar = new c();
        }
        n(view, cVar);
        k(view, fVar2.a());
        f(view).add(fVar2);
        h(view, 0);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            h1.d(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void n(View view, c cVar) {
        a aVar;
        if (cVar == null && (d(view) instanceof a)) {
            cVar = new c();
        }
        if (v0.c(view) == 0) {
            v0.s(view, 1);
        }
        if (cVar == null) {
            aVar = null;
        } else {
            aVar = cVar.f13726b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void o(View view, CharSequence charSequence) {
        boolean z10 = true;
        new r0(R.id.tag_accessibility_pane_title, 8, 28, true ? 1 : 0).g(view, charSequence);
        s0 s0Var = f13793f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = s0Var.f13821a;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z10 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(s0Var);
            if (y0.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(s0Var);
                return;
            }
            return;
        }
        s0Var.f13821a.remove(view);
        view.removeOnAttachStateChangeListener(s0Var);
        v0.o(view.getViewTreeObserver(), s0Var);
    }

    public static void p(View view, g2 g2Var) {
        m2 m2Var = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (g2Var != null) {
                m2Var = new m2(g2Var);
            }
            view.setWindowInsetsAnimationCallback(m2Var);
            return;
        }
        PathInterpolator pathInterpolator = k2.f13774e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (g2Var == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener j2Var = new j2(view, g2Var);
        view.setTag(R.id.tag_window_insets_animation_callback, j2Var);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(j2Var);
        }
    }
}
