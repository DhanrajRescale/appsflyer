package androidx.navigation.fragment;

import androidx.navigation.fragment.FragmentNavigator;
import iu.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y4.c;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2207a = new k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c initializer = (c) obj;
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        return new FragmentNavigator.ClearEntryStateViewModel();
    }
}
