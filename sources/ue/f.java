package ue;

import android.text.style.ClickableSpan;
import android.view.View;
import com.assetgro.stockgro.data.model.UserInfo;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class f extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f37086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserInfo f37088c;

    public f(Function2 function2, String str, UserInfo userInfo) {
        this.f37086a = function2;
        this.f37087b = str;
        this.f37088c = userInfo;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String str2 = this.f37087b;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String userName = this.f37088c.getUserName();
        if (userName != null) {
            str = userName;
        }
        this.f37086a.invoke(str2, str);
    }
}
