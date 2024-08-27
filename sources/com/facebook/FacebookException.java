package com.facebook;

import dj.e;
import java.util.Random;
import kotlin.Metadata;
import nl.t;
import nl.v;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "androidx/work/u", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class FacebookException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10879a = 0;
    public static final long serialVersionUID = 1;

    public FacebookException() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        if (message == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return message;
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !FacebookSdk.isInitialized() || random.nextInt(100) <= 50) {
            return;
        }
        v vVar = v.f28944a;
        v.a(new e(str, 4), t.ErrorReport);
    }
}
