package androidx.graphics.path;

import android.graphics.Path;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\b\u0000\u0018\u0000J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0082 J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H\u0082 J\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0007H\u0082 J!\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0012\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0082 J\u0011\u0010\u0013\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0082 J\u0011\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0082 ¨\u0006\u0015"}, d2 = {"Landroidx/graphics/path/PathIteratorPreApi34Impl;", "Landroid/graphics/Path;", "path", HttpUrl.FRAGMENT_ENCODE_SET, "conicEvaluation", HttpUrl.FRAGMENT_ENCODE_SET, "tolerance", HttpUrl.FRAGMENT_ENCODE_SET, "createInternalPathIterator", "internalPathIterator", HttpUrl.FRAGMENT_ENCODE_SET, "destroyInternalPathIterator", HttpUrl.FRAGMENT_ENCODE_SET, "internalPathIteratorHasNext", HttpUrl.FRAGMENT_ENCODE_SET, "points", "offset", "internalPathIteratorNext", "internalPathIteratorPeek", "internalPathIteratorRawSize", "internalPathIteratorSize", "graphics-path_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
        System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(Path path, int conicEvaluation, float tolerance);

    private final native void destroyInternalPathIterator(long internalPathIterator);

    private final native boolean internalPathIteratorHasNext(long internalPathIterator);

    private final native int internalPathIteratorNext(long internalPathIterator, float[] points, int offset);

    private final native int internalPathIteratorPeek(long internalPathIterator);

    private final native int internalPathIteratorRawSize(long internalPathIterator);

    private final native int internalPathIteratorSize(long internalPathIterator);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
