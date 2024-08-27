package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.f0;

/* loaded from: classes.dex */
public final class g extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21760a;

    /* renamed from: b, reason: collision with root package name */
    public final b f21761b;

    public g(Context context, b bVar) {
        this.f21760a = context;
        this.f21761b = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f21761b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f21761b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new f0(this.f21760a, (w3.a) this.f21761b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f21761b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f21761b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f21761b.f21746a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f21761b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f21761b.f21747b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f21761b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f21761b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f21761b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f21761b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f21761b.f21746a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f21761b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f21761b.o(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f21761b.j(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f21761b.l(i10);
    }
}
