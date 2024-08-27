package h1;

import android.view.View;
import android.view.autofill.AutofillManager;
import com.webengage.sdk.android.z0;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final View f17802a;

    /* renamed from: b, reason: collision with root package name */
    public final g f17803b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f17804c;

    public a(View view, g gVar) {
        this.f17802a = view;
        this.f17803b = gVar;
        AutofillManager g10 = z0.g(view.getContext().getSystemService(z0.h()));
        if (g10 != null) {
            this.f17804c = g10;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }
}
