package okhttp3.internal.http;

import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", HttpUrl.FRAGMENT_ENCODE_SET, "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z10) {
        this.forWebSocket = z10;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7 A[Catch: IOException -> 0x00ba, TryCatch #0 {IOException -> 0x00ba, blocks: (B:64:0x00ac, B:66:0x00b5, B:22:0x00bd, B:24:0x00e7, B:26:0x00f0, B:27:0x00f3, B:28:0x0117, B:32:0x0122, B:33:0x0141, B:35:0x014f, B:43:0x0165, B:45:0x016b, B:48:0x0178, B:50:0x018d, B:51:0x0195, B:52:0x019f, B:61:0x015a, B:62:0x0131), top: B:63:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b A[Catch: IOException -> 0x00ba, TryCatch #0 {IOException -> 0x00ba, blocks: (B:64:0x00ac, B:66:0x00b5, B:22:0x00bd, B:24:0x00e7, B:26:0x00f0, B:27:0x00f3, B:28:0x0117, B:32:0x0122, B:33:0x0141, B:35:0x014f, B:43:0x0165, B:45:0x016b, B:48:0x0178, B:50:0x018d, B:51:0x0195, B:52:0x019f, B:61:0x015a, B:62:0x0131), top: B:63:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0178 A[Catch: IOException -> 0x00ba, TryCatch #0 {IOException -> 0x00ba, blocks: (B:64:0x00ac, B:66:0x00b5, B:22:0x00bd, B:24:0x00e7, B:26:0x00f0, B:27:0x00f3, B:28:0x0117, B:32:0x0122, B:33:0x0141, B:35:0x014f, B:43:0x0165, B:45:0x016b, B:48:0x0178, B:50:0x018d, B:51:0x0195, B:52:0x019f, B:61:0x015a, B:62:0x0131), top: B:63:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    @Override // okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
