package in.juspay.hyper.core;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface FileProviderInterface {
    String readFromFile(@NonNull Context context, String str);

    void renewFile(@NonNull String str, @NonNull String str2, long j10);
}
