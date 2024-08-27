package h;

import android.R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class g0 extends androidx.activity.o implements n {

    /* renamed from: d, reason: collision with root package name */
    public e0 f17665d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f17666e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g0(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130969018(0x7f0401ba, float:1.7546706E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            h.f0 r2 = new h.f0
            r2.<init>()
            r4.f17666e = r2
            h.q r2 = r4.e()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            h.e0 r5 = (h.e0) r5
            r5.f17635l0 = r6
            r5 = 0
            r2.d(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g0.<init>(android.content.Context, int):void");
    }

    @Override // androidx.activity.o, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e0 e0Var = (e0) e();
        e0Var.w();
        ((ViewGroup) e0Var.B.findViewById(R.id.content)).addView(view, layoutParams);
        e0Var.f17636m.a(e0Var.f17634l.getCallback());
    }

    @Override // h.n
    public final void c() {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return hl.f.U(this.f17666e, getWindow().getDecorView(), this, keyEvent);
    }

    public final q e() {
        if (this.f17665d == null) {
            n0 n0Var = q.f17721a;
            this.f17665d = new e0(getContext(), getWindow(), this, this);
        }
        return this.f17665d;
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        e0 e0Var = (e0) e();
        e0Var.w();
        return e0Var.f17634l.findViewById(i10);
    }

    @Override // h.n
    public final void g() {
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().b();
    }

    @Override // h.n
    public final void j() {
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().d(bundle);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public final void onStop() {
        super.onStop();
        e0 e0Var = (e0) e();
        e0Var.A();
        vl.b bVar = e0Var.f17639o;
        if (bVar != null) {
            bVar.k0(false);
        }
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void setContentView(int i10) {
        e().h(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().k(charSequence);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void setContentView(View view) {
        e().i(view);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().j(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        e().k(getContext().getString(i10));
    }
}
