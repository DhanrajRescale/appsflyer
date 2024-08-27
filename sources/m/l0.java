package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class l0 implements q0, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public h.j f25617a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f25618b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f25619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0 f25620d;

    public l0(r0 r0Var) {
        this.f25620d = r0Var;
    }

    @Override // m.q0
    public final boolean a() {
        h.j jVar = this.f25617a;
        if (jVar != null) {
            return jVar.isShowing();
        }
        return false;
    }

    @Override // m.q0
    public final int b() {
        return 0;
    }

    @Override // m.q0
    public final void c(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // m.q0
    public final CharSequence d() {
        return this.f25619c;
    }

    @Override // m.q0
    public final void dismiss() {
        h.j jVar = this.f25617a;
        if (jVar != null) {
            jVar.dismiss();
            this.f25617a = null;
        }
    }

    @Override // m.q0
    public final Drawable e() {
        return null;
    }

    @Override // m.q0
    public final void g(CharSequence charSequence) {
        this.f25619c = charSequence;
    }

    @Override // m.q0
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // m.q0
    public final void j(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.q0
    public final void k(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // m.q0
    public final void l(int i10, int i11) {
        if (this.f25618b == null) {
            return;
        }
        r0 r0Var = this.f25620d;
        h.i iVar = new h.i(r0Var.getPopupContext());
        CharSequence charSequence = this.f25619c;
        if (charSequence != null) {
            iVar.setTitle(charSequence);
        }
        ListAdapter listAdapter = this.f25618b;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        h.e eVar = iVar.f17693a;
        eVar.f17619n = listAdapter;
        eVar.f17620o = this;
        eVar.f17623r = selectedItemPosition;
        eVar.f17622q = true;
        h.j create = iVar.create();
        this.f25617a = create;
        AlertController$RecycleListView alertController$RecycleListView = create.f17699f.f17673g;
        j0.d(alertController$RecycleListView, i10);
        j0.c(alertController$RecycleListView, i11);
        this.f25617a.show();
    }

    @Override // m.q0
    public final int n() {
        return 0;
    }

    @Override // m.q0
    public final void o(ListAdapter listAdapter) {
        this.f25618b = listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        r0 r0Var = this.f25620d;
        r0Var.setSelection(i10);
        if (r0Var.getOnItemClickListener() != null) {
            r0Var.performItemClick(null, i10, this.f25618b.getItemId(i10));
        }
        dismiss();
    }
}
