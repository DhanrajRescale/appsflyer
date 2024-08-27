package com.facebook;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xk.d0;
import xk.q;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FacebookGraphResponseException extends FacebookException {

    /* renamed from: b, reason: collision with root package name */
    public final d0 f10880b;

    public FacebookGraphResponseException(d0 d0Var, String str) {
        super(str);
        this.f10880b = d0Var;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        q qVar;
        d0 d0Var = this.f10880b;
        if (d0Var == null) {
            qVar = null;
        } else {
            qVar = d0Var.f40344c;
        }
        StringBuilder sb2 = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (qVar != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(qVar.f40458a);
            sb2.append(", facebookErrorCode: ");
            sb2.append(qVar.f40459b);
            sb2.append(", facebookErrorType: ");
            sb2.append(qVar.f40461d);
            sb2.append(", message: ");
            sb2.append(qVar.a());
            sb2.append(UrlTreeKt.componentParamSuffix);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "errorStringBuilder.toString()");
        return sb3;
    }
}
