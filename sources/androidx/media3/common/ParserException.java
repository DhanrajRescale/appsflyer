package androidx.media3.common;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.IOException;
import nn.d;

/* loaded from: classes.dex */
public class ParserException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2046a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2047b;

    public ParserException(String str, Exception exc, boolean z10, int i10) {
        super(str, exc);
        this.f2046a = z10;
        this.f2047b = i10;
    }

    public static ParserException a(String str, Exception exc) {
        return new ParserException(str, exc, true, 1);
    }

    public static ParserException b(String str, Exception exc) {
        return new ParserException(str, exc, true, 4);
    }

    public static ParserException c(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f2046a);
        sb2.append(", dataType=");
        return d.m(sb2, this.f2047b, UrlTreeKt.componentParamSuffix);
    }
}
