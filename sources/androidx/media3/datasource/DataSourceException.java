package androidx.media3.datasource;

import java.io.IOException;

/* loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2055b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f2056a;

    public DataSourceException(int i10) {
        this.f2056a = i10;
    }

    public DataSourceException(int i10, Throwable th2) {
        super(th2);
        this.f2056a = i10;
    }

    public DataSourceException(String str, int i10) {
        super(str);
        this.f2056a = i10;
    }

    public DataSourceException(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f2056a = i10;
    }
}
