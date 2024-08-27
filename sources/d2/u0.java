package d2;

import android.view.PointerIcon;
import android.view.View;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f13646a = new Object();

    public final void a(@NotNull View view, x1.p pVar) {
        PointerIcon systemIcon;
        if (pVar instanceof x1.a) {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), ((x1.a) pVar).f39823b);
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        }
        if (!Intrinsics.a(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
