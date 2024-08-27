package i9;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f19742b;

    public /* synthetic */ a(int i10, Function1 function1) {
        this.f19741a = i10;
        this.f19742b = function1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s7) {
        switch (this.f19741a) {
            case 0:
                Intrinsics.e(s7, "s");
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s7, int i10, int i11, int i12) {
        switch (this.f19741a) {
            case 0:
                Intrinsics.e(s7, "s");
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s7, int i10, int i11, int i12) {
        int i13 = this.f19741a;
        Function1 function1 = this.f19742b;
        switch (i13) {
            case 0:
                Intrinsics.e(s7, "s");
                function1.invoke(s7);
                return;
            default:
                function1.invoke(String.valueOf(s7));
                return;
        }
    }
}
