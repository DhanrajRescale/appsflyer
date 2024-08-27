package sb;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34435a;

    public /* synthetic */ b(int i10) {
        this.f34435a = i10;
    }

    public static pc.f a(String assetClass) {
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        pc.f fVar = new pc.f();
        Bundle bundle = new Bundle();
        bundle.putString("arg_asset_class", assetClass);
        fVar.setArguments(bundle);
        return fVar;
    }

    public static yd.e b(String title, String positiveButtonText, String negativeButtonText, yd.c listener, List exitReasons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(exitReasons, "exitReasons");
        Bundle bundle = new Bundle();
        bundle.putString("KEY_TITLE", title);
        bundle.putString("KEY_POSITIVE_BUTTON_TEXT", positiveButtonText);
        bundle.putString("KEY_NEGATIVE_BUTTON_TEXT", negativeButtonText);
        yd.e.f41538e = "nil";
        yd.e.f41537d = null;
        yd.e.f41535b = listener;
        ArrayList arrayList = yd.e.f41536c;
        arrayList.clear();
        arrayList.addAll(exitReasons);
        yd.e eVar = new yd.e();
        eVar.setArguments(bundle);
        return eVar;
    }

    public static fd.c c(String name, Long l10, qu.f0 coroutineScope, Function1 action) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(action, "action");
        fd.c cVar = new fd.c(name, l10, coroutineScope, action);
        yk.g.H(coroutineScope, null, null, new fd.a(cVar, null), 3);
        return cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        this(0);
        this.f34435a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
            default:
                return;
        }
    }
}
