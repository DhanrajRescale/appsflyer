package m;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class b1 extends t9.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f25492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(AppCompatTextView appCompatTextView) {
        super(appCompatTextView, 6);
        this.f25492c = appCompatTextView;
    }

    @Override // t9.c, m.a1
    public final void i(int i10) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i10);
    }

    @Override // t9.c, m.a1
    public final void o(int i10) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i10);
    }
}
