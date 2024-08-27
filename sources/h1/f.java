package h1;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f extends AutofillManager$AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final f f17807a = new AutofillManager$AutofillCallback();

    public final void a(@NotNull a aVar) {
        aVar.f17804c.registerCallback(b.k(this));
    }

    public final void b(@NotNull a aVar) {
        aVar.f17804c.unregisterCallback(b.k(this));
    }

    public final void onAutofillEvent(View view, int i10, int i11) {
        String str;
        super.onAutofillEvent(view, i10, i11);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    str = "Unknown status event.";
                } else {
                    str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            } else {
                str = "Autofill popup was hidden.";
            }
        } else {
            str = "Autofill popup was shown.";
        }
        Log.d("Autofill Status", str);
    }
}
