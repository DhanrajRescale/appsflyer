package h1;

import android.media.AudioFocusRequest;
import android.view.autofill.AutofillManager$AutofillCallback;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ AudioFocusRequest.Builder c(int i10) {
        return new AudioFocusRequest.Builder(i10);
    }

    public static /* synthetic */ AudioFocusRequest.Builder g(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ AutofillManager$AutofillCallback k(Object obj) {
        return (AutofillManager$AutofillCallback) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue l(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* synthetic */ void n() {
    }
}
