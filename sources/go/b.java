package go;

import android.R;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import d4.b1;
import d4.n1;
import h.i;
import h.j;
import java.util.WeakHashMap;
import to.h;

/* loaded from: classes2.dex */
public final class b extends i {

    /* renamed from: c, reason: collision with root package name */
    public final h f17533c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f17534d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(com.firebase.ui.auth.ui.email.RecoverPasswordActivity r19) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: go.b.<init>(com.firebase.ui.auth.ui.email.RecoverPasswordActivity):void");
    }

    @Override // h.i
    public final i a() {
        this.f17693a.f17616k = false;
        return this;
    }

    @Override // h.i
    public final i b(String str) {
        this.f17693a.f17611f = str;
        return this;
    }

    @Override // h.i
    public final j create() {
        j create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        h hVar = this.f17533c;
        if (hVar instanceof h) {
            WeakHashMap weakHashMap = n1.f13788a;
            hVar.m(b1.i(decorView));
        }
        Rect rect = this.f17534d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) hVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(create, rect));
        return create;
    }

    public final b d() {
        return (b) super.setPositiveButton(R.string.ok, null);
    }

    @Override // h.i
    public final i setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(i10, onClickListener);
    }

    @Override // h.i
    public final i setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(i10, onClickListener);
    }

    @Override // h.i
    public final i setTitle(CharSequence charSequence) {
        return (b) super.setTitle(charSequence);
    }

    @Override // h.i
    public final i setView(View view) {
        return (b) super.setView(view);
    }
}
