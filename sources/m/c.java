package m;

import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionBarContextView;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;

/* loaded from: classes.dex */
public final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25496a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25498c;

    public c(DialogActionButtonLayout dialogActionButtonLayout, e9.c cVar) {
        this.f25497b = dialogActionButtonLayout;
        this.f25498c = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f25496a;
        Object obj = this.f25497b;
        switch (i10) {
            case 0:
                ((k.b) obj).a();
                return;
            case 1:
                w3 w3Var = (w3) this.f25498c;
                Window.Callback callback = w3Var.f25790k;
                if (callback != null && w3Var.f25791l) {
                    callback.onMenuItemSelected(0, (l.a) obj);
                    return;
                }
                return;
            default:
                ((DialogActionButtonLayout) obj).getDialog();
                throw null;
        }
    }

    public c(ActionBarContextView actionBarContextView, k.b bVar) {
        this.f25498c = actionBarContextView;
        this.f25497b = bVar;
    }

    public c(w3 w3Var) {
        this.f25498c = w3Var;
        this.f25497b = new l.a(w3Var.f25780a.getContext(), w3Var.f25787h);
    }
}
