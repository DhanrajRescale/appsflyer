package r4;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import mt.p;

/* loaded from: classes.dex */
public final class h extends p {

    /* renamed from: a, reason: collision with root package name */
    public final g f33070a;

    public h(TextView textView) {
        super(6);
        this.f33070a = new g(textView);
    }

    @Override // mt.p
    public final void C(boolean z10) {
        Object obj = q4.a.f31656a;
    }

    @Override // mt.p
    public final void D(boolean z10) {
        Object obj = q4.a.f31656a;
        this.f33070a.f33069c = z10;
    }

    @Override // mt.p
    public final TransformationMethod I(TransformationMethod transformationMethod) {
        Object obj = q4.a.f31656a;
        return transformationMethod;
    }

    @Override // mt.p
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        Object obj = q4.a.f31656a;
        return inputFilterArr;
    }

    @Override // mt.p
    public final boolean z() {
        return this.f33070a.f33069c;
    }
}
