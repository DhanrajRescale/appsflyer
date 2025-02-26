package okhttp3;

import bv.n0;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u0000H&¨\u0006\u0012"}, d2 = {"Lokhttp3/Call;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "execute", "Lokhttp3/Callback;", "responseCallback", HttpUrl.FRAGMENT_ENCODE_SET, "enqueue", "cancel", HttpUrl.FRAGMENT_ENCODE_SET, "isExecuted", "isCanceled", "Lbv/n0;", "timeout", "clone", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface Call extends Cloneable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lokhttp3/Call$Factory;", HttpUrl.FRAGMENT_ENCODE_SET, "newCall", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        Call newCall(@NotNull Request request);
    }

    void cancel();

    @NotNull
    Call clone();

    void enqueue(@NotNull Callback responseCallback);

    @NotNull
    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    @NotNull
    Request request();

    @NotNull
    n0 timeout();
}
