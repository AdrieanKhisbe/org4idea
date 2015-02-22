package tk.skuro.idea.orgmode.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Carlo Sciolla
 * @since 0.1
 */
public class OrgPsiElementImpl extends ASTWrapperPsiElement {
    public OrgPsiElementImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
