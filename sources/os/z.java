package os;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class z extends c0 {

    /* renamed from: f, reason: collision with root package name */
    public final int f30412f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakHashMap f30413g;

    public z(List list, int i10, String str, d dVar) {
        super(list, str, dVar, false);
        this.f30412f = i10;
        this.f30413g = new WeakHashMap();
    }

    public static View.AccessibilityDelegate e(View view) {
        try {
            return (View.AccessibilityDelegate) view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            el.l.W0("MixpanelAPI.ViewVisitor", "getAccessibilityDelegate threw an exception when called.", e10);
            return null;
        }
    }

    @Override // os.k0
    public final void a(View view) {
        View.AccessibilityDelegate e10 = e(view);
        if ((e10 instanceof y) && ((y) e10).b(this.f30298d)) {
            return;
        }
        y yVar = new y(this, e10);
        view.setAccessibilityDelegate(yVar);
        this.f30413g.put(view, yVar);
    }

    @Override // os.k0
    public final void b() {
        WeakHashMap weakHashMap = this.f30413g;
        for (Map.Entry entry : weakHashMap.entrySet()) {
            View view = (View) entry.getKey();
            y yVar = (y) entry.getValue();
            View.AccessibilityDelegate e10 = e(view);
            if (e10 == yVar) {
                view.setAccessibilityDelegate(yVar.f30410a);
            } else if (e10 instanceof y) {
                ((y) e10).a(yVar);
            }
        }
        weakHashMap.clear();
    }
}
