package androidx.media3.datasource;

import java.util.Map;
import jr.h;

/* loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* renamed from: d, reason: collision with root package name */
    public final int f2058d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f2059e;

    public HttpDataSource$InvalidResponseCodeException(int i10, DataSourceException dataSourceException, Map map) {
        super(h.n("Response code: ", i10), dataSourceException, 2004);
        this.f2058d = i10;
        this.f2059e = map;
    }
}
