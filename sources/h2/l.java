package h2;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f17853a = new AtomicInteger(0);

    public static final g1.o a(g1.o oVar, boolean z10, Function1 function1) {
        return oVar.g(new AppendedSemanticsElement(function1, z10));
    }

    public static /* synthetic */ g1.o b(g1.o oVar, Function1 function1) {
        return a(oVar, false, function1);
    }
}
