package h;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class y implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f17785a;

    /* renamed from: b, reason: collision with root package name */
    public e.l f17786b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17787c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17788d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f17790f;

    public y(e0 e0Var, Window.Callback callback) {
        this.f17790f = e0Var;
        if (callback != null) {
            this.f17785a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f17787c = true;
            callback.onContentChanged();
        } finally {
            this.f17787c = false;
        }
    }

    @Override // android.view.Window.Callback
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f17785a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f17785a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        this.f17785a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f17785a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f17788d;
        Window.Callback callback = this.f17785a;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f17790f.t(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.f17785a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        e0 e0Var = this.f17790f;
        e0Var.A();
        vl.b bVar = e0Var.f17639o;
        if (bVar != null && bVar.L(keyCode, keyEvent)) {
            return true;
        }
        d0 d0Var = e0Var.f17625e0;
        if (d0Var != null && e0Var.F(d0Var, keyEvent.getKeyCode(), keyEvent)) {
            d0 d0Var2 = e0Var.f17625e0;
            if (d0Var2 == null) {
                return true;
            }
            d0Var2.f17601l = true;
            return true;
        }
        if (e0Var.f17625e0 == null) {
            d0 z10 = e0Var.z(0);
            e0Var.G(z10, keyEvent);
            boolean F = e0Var.F(z10, keyEvent.getKeyCode(), keyEvent);
            z10.f17600k = false;
            if (F) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f17785a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f17785a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f17785a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void onDetachedFromWindow() {
        this.f17785a.onDetachedFromWindow();
    }

    public final boolean f(int i10, Menu menu) {
        return this.f17785a.onMenuOpened(i10, menu);
    }

    public final void g(int i10, Menu menu) {
        this.f17785a.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onPointerCaptureChanged(boolean z10) {
        k.o.a(this.f17785a, z10);
    }

    public final void i(List list, Menu menu, int i10) {
        k.n.a(this.f17785a, list, menu, i10);
    }

    @Override // android.view.Window.Callback
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f17785a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z10) {
        this.f17785a.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f17787c) {
            this.f17785a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0 && !(menu instanceof l.o)) {
            return false;
        }
        return this.f17785a.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        View view;
        e.l lVar = this.f17786b;
        if (lVar != null) {
            if (i10 == 0) {
                view = new View(((s0) lVar.f14641b).f17738g.f25780a.getContext());
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return this.f17785a.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f17785a.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        f(i10, menu);
        e0 e0Var = this.f17790f;
        if (i10 == 108) {
            e0Var.A();
            vl.b bVar = e0Var.f17639o;
            if (bVar != null) {
                bVar.m(true);
            }
        } else {
            e0Var.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.f17789e) {
            this.f17785a.onPanelClosed(i10, menu);
            return;
        }
        g(i10, menu);
        e0 e0Var = this.f17790f;
        if (i10 == 108) {
            e0Var.A();
            vl.b bVar = e0Var.f17639o;
            if (bVar != null) {
                bVar.m(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            d0 z10 = e0Var.z(i10);
            if (z10.f17602m) {
                e0Var.r(z10, false);
                return;
            }
            return;
        }
        e0Var.getClass();
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        l.o oVar;
        if (menu instanceof l.o) {
            oVar = (l.o) menu;
        } else {
            oVar = null;
        }
        if (i10 == 0 && oVar == null) {
            return false;
        }
        if (oVar != null) {
            oVar.f23659x = true;
        }
        e.l lVar = this.f17786b;
        if (lVar != null && i10 == 0) {
            s0 s0Var = (s0) lVar.f14641b;
            if (!s0Var.f17741j) {
                s0Var.f17738g.f25791l = true;
                s0Var.f17741j = true;
            }
        }
        boolean onPreparePanel = this.f17785a.onPreparePanel(i10, view, menu);
        if (oVar != null) {
            oVar.f23659x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.o oVar = this.f17790f.z(0).f17597h;
        if (oVar != null) {
            i(list, oVar, i10);
        } else {
            i(list, menu, i10);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.m.a(this.f17785a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f17785a.onSearchRequested();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
    /* JADX WARN: Type inference failed for: r1v10, types: [k.f, java.lang.Object, l.m, k.b] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }
}
