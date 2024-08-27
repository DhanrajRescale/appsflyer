package h2;

import iu.a0;
import iu.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vt.x;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ou.g[] f17908a;

    static {
        iu.n nVar = new iu.n(t.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        b0 b0Var = a0.f20536a;
        b0Var.getClass();
        iu.n nVar2 = new iu.n(t.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1);
        b0Var.getClass();
        f17908a = new ou.g[]{nVar, da.e.l(t.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1, b0Var), da.e.l(t.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, b0Var), da.e.l(t.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, b0Var), da.e.l(t.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, b0Var), da.e.l(t.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, b0Var), da.e.l(t.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1, b0Var), da.e.l(t.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, b0Var), da.e.l(t.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, b0Var), da.e.l(t.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, b0Var), da.e.l(t.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, b0Var), da.e.l(t.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, b0Var), da.e.l(t.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, b0Var), da.e.l(t.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, b0Var), nVar2, da.e.l(t.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, b0Var), da.e.l(t.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, b0Var), da.e.l(t.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1, b0Var), da.e.l(t.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1, b0Var), da.e.l(t.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1, b0Var), da.e.l(t.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1, b0Var)};
        r rVar = r.f17881a;
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        rVar.getClass();
        u uVar = i.f17825a;
    }

    public static final u a(String str) {
        u uVar = new u(str);
        uVar.f17911c = true;
        return uVar;
    }

    public static final u b(String str, q qVar) {
        return new u(str, true, qVar);
    }

    public static void c(v vVar, Function1 function1) {
        ((j) vVar).h(i.f17825a, new a(null, function1));
    }

    public static final void d(v vVar) {
        u uVar = r.f17893m;
        ou.g gVar = f17908a[5];
        uVar.a(vVar, Boolean.TRUE);
        ((j) vVar).h(r.f17894n, Unit.f23355a);
    }

    public static final void e(v vVar, String str) {
        r rVar = r.f17881a;
        ((j) vVar).h(r.f17882b, x.a(str));
    }

    public static final void f(v vVar, int i10) {
        u uVar = r.f17901u;
        ou.g gVar = f17908a[9];
        uVar.a(vVar, new g(i10));
    }
}
