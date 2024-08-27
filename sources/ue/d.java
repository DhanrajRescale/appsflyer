package ue;

import android.view.View;
import com.assetgro.stockgro.data.model.ChatMessage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f37081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f37082c;

    public /* synthetic */ d(Function1 function1, ChatMessage chatMessage, int i10) {
        this.f37080a = i10;
        this.f37081b = function1;
        this.f37082c = chatMessage;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.f37080a;
        ChatMessage message = this.f37082c;
        Function1 onLongPress = this.f37081b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(onLongPress, "$onLongPress");
                Intrinsics.checkNotNullParameter(message, "$message");
                onLongPress.invoke(message);
                return true;
            case 1:
                Intrinsics.checkNotNullParameter(onLongPress, "$onLongPress");
                Intrinsics.checkNotNullParameter(message, "$message");
                onLongPress.invoke(message);
                return true;
            default:
                Intrinsics.checkNotNullParameter(onLongPress, "$onLongPress");
                Intrinsics.checkNotNullParameter(message, "$message");
                onLongPress.invoke(message);
                return true;
        }
    }
}
