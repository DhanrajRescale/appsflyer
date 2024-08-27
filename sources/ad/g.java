package ad;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.t;
import ba.cn;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.m;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lad/g;", "Landroidx/fragment/app/t;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends t {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f365e = 0;

    /* renamed from: a, reason: collision with root package name */
    public cn f366a;

    /* renamed from: b, reason: collision with root package name */
    public String f367b = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: c, reason: collision with root package name */
    public String f368c = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f369d;

    @Override // androidx.fragment.app.t
    public final int getTheme() {
        return R.style.DarkTransparentBgDialog;
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        int i10 = cn.f4393t;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        cn cnVar = (cn) m.g(inflater, R.layout.fragment_share_your_achievement_dialog, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(cnVar, "inflate(...)");
        this.f366a = cnVar;
        if (cnVar != null) {
            View view = cnVar.f27491e;
            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
            return view;
        }
        Intrinsics.k("binding");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("SHARE_ACHIEVEMENT_IMAGE_URL", HttpUrl.FRAGMENT_ENCODE_SET);
        } else {
            str = null;
        }
        if (str != null) {
            this.f367b = str;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str2 = arguments2.getString("SHARE_ACHIEVEMENT_SHARE_TEXT", HttpUrl.FRAGMENT_ENCODE_SET);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                this.f368c = str2;
                cn cnVar = this.f366a;
                if (cnVar != null) {
                    androidx.compose.foundation.layout.e eVar = new androidx.compose.foundation.layout.e(this, 20);
                    Object obj = b1.d.f3079a;
                    cnVar.f4394s.setContent(new b1.c(eVar, true, 1719764000));
                    return;
                }
                Intrinsics.k("binding");
                throw null;
            }
            throw new IllegalStateException("The Share Text is a required parameter".toString());
        }
        throw new IllegalStateException("The Image Url is a required paramter".toString());
    }
}
