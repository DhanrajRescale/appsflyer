package qj;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import ba.sr;
import com.assetgro.stockgro.widget.InputView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputView f32069b;

    public /* synthetic */ w(InputView inputView, int i10) {
        this.f32068a = i10;
        this.f32069b = inputView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s7) {
        switch (this.f32068a) {
            case 0:
                Intrinsics.checkNotNullParameter(s7, "s");
                return;
            default:
                Intrinsics.checkNotNullParameter(s7, "s");
                String obj = s7.toString();
                InputView inputView = this.f32069b;
                if (!kotlin.text.s.r(obj, inputView.getNumberPrefix(), false)) {
                    sr srVar = inputView.D;
                    srVar.f6123x.setText(inputView.getNumberPrefix());
                    EditText editText = srVar.f6123x;
                    Selection.setSelection(editText.getText(), editText.getText().length());
                    return;
                }
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s7, int i10, int i11, int i12) {
        switch (this.f32068a) {
            case 0:
                return;
            default:
                Intrinsics.checkNotNullParameter(s7, "s");
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s7, int i10, int i11, int i12) {
        switch (this.f32068a) {
            case 0:
                InputView inputView = this.f32069b;
                if (s7 != null) {
                    inputView.f10642w = s7.toString();
                }
                r onInputViewAction = inputView.getOnInputViewAction();
                if (onInputViewAction != null) {
                    onInputViewAction.f(inputView.f10642w);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(s7, "s");
                return;
        }
    }
}
