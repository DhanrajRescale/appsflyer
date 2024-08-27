package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import t.j0;

/* loaded from: classes.dex */
public class f0 extends d implements Menu {

    /* renamed from: d, reason: collision with root package name */
    public final w3.a f23566d;

    public f0(Context context, w3.a aVar) {
        super(context, 0);
        if (aVar != null) {
            this.f23566d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return e(((o) this.f23566d).add(i10));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = ((o) this.f23566d).addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = e(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return ((o) this.f23566d).addSubMenu(i10);
    }

    @Override // android.view.Menu
    public final void clear() {
        j0 j0Var = (j0) this.f23560b;
        if (j0Var != null) {
            j0Var.clear();
        }
        j0 j0Var2 = (j0) this.f23561c;
        if (j0Var2 != null) {
            j0Var2.clear();
        }
        ((o) this.f23566d).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((o) this.f23566d).c(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return e(((o) this.f23566d).findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return e(((o) this.f23566d).getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((o) this.f23566d).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return ((o) this.f23566d).isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return ((o) this.f23566d).performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return ((o) this.f23566d).performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((j0) this.f23560b) != null) {
            int i11 = 0;
            while (true) {
                j0 j0Var = (j0) this.f23560b;
                if (i11 >= j0Var.f34873c) {
                    break;
                }
                if (((w3.b) j0Var.f(i11)).getGroupId() == i10) {
                    ((j0) this.f23560b).h(i11);
                    i11--;
                }
                i11++;
            }
        }
        ((o) this.f23566d).removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((j0) this.f23560b) != null) {
            int i11 = 0;
            while (true) {
                j0 j0Var = (j0) this.f23560b;
                if (i11 >= j0Var.f34873c) {
                    break;
                }
                if (((w3.b) j0Var.f(i11)).getItemId() == i10) {
                    ((j0) this.f23560b).h(i11);
                    break;
                }
                i11++;
            }
        }
        ((o) this.f23566d).removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ((o) this.f23566d).setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ((o) this.f23566d).setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        ((o) this.f23566d).setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f23566d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((o) this.f23566d).f23641f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return e(((o) this.f23566d).add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.f23566d.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return e(((o) this.f23566d).a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return ((o) this.f23566d).addSubMenu(i10, i11, i12, i13);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((o) this.f23566d).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return e(((o) this.f23566d).a(i10, i11, i12, charSequence));
    }
}
