package zo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f42642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42643c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f42644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f42645e;

    public n(p pVar, int i10, TextView textView, int i11, TextView textView2) {
        this.f42645e = pVar;
        this.f42641a = i10;
        this.f42642b = textView;
        this.f42643c = i11;
        this.f42644d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i10 = this.f42641a;
        p pVar = this.f42645e;
        pVar.f42660n = i10;
        pVar.f42658l = null;
        TextView textView = this.f42642b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f42643c == 1 && (appCompatTextView = pVar.f42664r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f42644d;
        if (textView2 != null) {
            textView2.setTranslationY(s0.g.f34069a);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f42644d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(s0.g.f34069a);
        }
    }
}
