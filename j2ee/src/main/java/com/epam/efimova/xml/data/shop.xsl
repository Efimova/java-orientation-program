<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/">
		<html>
			<body>
				<h2>Products in the shop</h2>
				<ul>
					<xsl:for-each select="shop/categry">
						<li>
							<a href="">
								<xsl:value-of select="@caption" />
								<xsl:variable name="id_cat" select="@id" />
								<xsl:value-of
									select="concat(' (',count(//categry[@id=$id_cat]/subcategry/good),')')" />
							</a>
							<div class="submenu">
								<ul>
									<xsl:for-each select="//categry[@id=$id_cat]/subcategry">
										<li>
											<xsl:value-of select="@caption" />
											<xsl:variable name="id_sub" select="@id" />
											<xsl:value-of
												select="concat(' (',count(//categry[@id=$id_cat]/subcategry[@id=$id_sub]/good),')')" />
										</li>
									</xsl:for-each>
								</ul>
							</div>
						</li>

					</xsl:for-each>
				</ul>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
