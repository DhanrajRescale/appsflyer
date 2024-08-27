package com.facebook;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xk.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "ek/h", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FacebookServiceException extends FacebookException {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final q f10881b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(q requestError, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(requestError, "requestError");
        this.f10881b = requestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        q qVar = this.f10881b;
        sb2.append(qVar.f40458a);
        sb2.append(", facebookErrorCode: ");
        sb2.append(qVar.f40459b);
        sb2.append(", facebookErrorType: ");
        sb2.append(qVar.f40461d);
        sb2.append(", message: ");
        sb2.append(qVar.a());
        sb2.append(UrlTreeKt.componentParamSuffix);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return sb3;
    }
}
