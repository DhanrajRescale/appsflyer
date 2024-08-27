package com.google.android.recaptcha;

import androidx.annotation.NonNull;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import ut.l;
import yt.a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/google/android/recaptcha/RecaptchaClient;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/google/android/recaptcha/RecaptchaAction;", "recaptchaAction", "Lut/l;", HttpUrl.FRAGMENT_ENCODE_SET, "execute-gIAlu-s", "(Lcom/google/android/recaptcha/RecaptchaAction;Lyt/a;)Ljava/lang/Object;", "execute", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface RecaptchaClient {
    @NonNull
    /* renamed from: execute-gIAlu-s, reason: not valid java name */
    Object mo20executegIAlus(@NonNull RecaptchaAction recaptchaAction, @NonNull a<? super l<String>> aVar);
}
