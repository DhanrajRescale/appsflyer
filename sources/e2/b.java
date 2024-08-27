package e2;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import c2.p0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m1.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f14952a;

    /* renamed from: b, reason: collision with root package name */
    public d f14953b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f14954c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f14955d;

    /* renamed from: e, reason: collision with root package name */
    public Function0 f14956e;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f14957f;

    public b(p0 p0Var) {
        d dVar = d.f27238e;
        this.f14952a = p0Var;
        this.f14953b = dVar;
        this.f14954c = null;
        this.f14955d = null;
        this.f14956e = null;
        this.f14957f = null;
    }

    public static void a(Menu menu, int i10) {
        int i11;
        if (i10 != 0) {
            int i12 = i10 - 1;
            if (i10 != 0) {
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                i11 = R.string.selectAll;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            i11 = R.string.cut;
                        }
                    } else {
                        i11 = R.string.paste;
                    }
                } else {
                    i11 = R.string.copy;
                }
                if (i10 != 0) {
                    menu.add(0, i12, i12, i11).setShowAsAction(1);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public static void b(Menu menu, int i10, Function0 function0) {
        if (function0 != null) {
            if (i10 != 0) {
                if (menu.findItem(i10 - 1) == null) {
                    a(menu, i10);
                    return;
                }
            } else {
                throw null;
            }
        }
        if (function0 == null) {
            if (i10 != 0) {
                int i11 = i10 - 1;
                if (menu.findItem(i11) != null) {
                    if (i10 != 0) {
                        menu.removeItem(i11);
                        return;
                    }
                    throw null;
                }
                return;
            }
            throw null;
        }
    }

    public final boolean c(ActionMode actionMode, MenuItem menuItem) {
        Intrinsics.c(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            Function0 function0 = this.f14954c;
            if (function0 != null) {
                function0.mo2invoke();
            }
        } else if (itemId == 1) {
            Function0 function02 = this.f14955d;
            if (function02 != null) {
                function02.mo2invoke();
            }
        } else if (itemId == 2) {
            Function0 function03 = this.f14956e;
            if (function03 != null) {
                function03.mo2invoke();
            }
        } else if (itemId == 3) {
            Function0 function04 = this.f14957f;
            if (function04 != null) {
                function04.mo2invoke();
            }
        } else {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    public final void d(ActionMode actionMode, Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.f14954c != null) {
                    a(menu, 1);
                }
                if (this.f14955d != null) {
                    a(menu, 2);
                }
                if (this.f14956e != null) {
                    a(menu, 3);
                }
                if (this.f14957f != null) {
                    a(menu, 4);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        throw new IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (actionMode != null && menu != null) {
            b(menu, 1, this.f14954c);
            b(menu, 2, this.f14955d);
            b(menu, 3, this.f14956e);
            b(menu, 4, this.f14957f);
            return true;
        }
        return false;
    }
}
